#include <iostream>
#include <vector>
#include <string>
#include <numeric>
#include <algorithm>
#include <cstdlib>
#include <ctime>

using namespace std;

class Subject {
public:
    string name;

    Subject(string name) {
        this->name = name;
    }
};

class StudentSubject {
public:
    Subject* subject;
    int marks;

    StudentSubject(Subject* subject, int marks) {
        this->subject = subject;
        this->marks = marks;
    }
};

class Student {
public:
    string name;
    vector<StudentSubject> allSubjects;
    int rank = 0;

    Student(string name) {
        this->name = name;
    }

    void assignSubjects(const vector<StudentSubject>& subjects) {
        allSubjects = subjects;
    }

    int calculateTotalMarks() const {
        return accumulate(
            allSubjects.begin(),
            allSubjects.end(),
            0,
            [](int sum, const StudentSubject& ss) {
                return sum + ss.marks;
            });
    }
};

int main() {

    srand(time(nullptr));

    Subject hindi("Hindi");
    Subject english("English");
    Subject math("Math");
    Subject physics("Physics");
    Subject chemistry("Chemistry");

    vector<Subject*> subjects = {
        &hindi,
        &english,
        &math,
        &physics,
        &chemistry
    };

    vector<Student> students;

    // Create 20 students
    for (int i = 1; i <= 20; i++) {

        Student student("Student-" + to_string(i));

        vector<StudentSubject> studentSubjects;

        for (auto subject : subjects) {

            int marks = 30 + rand() % 71; // 30-100

            studentSubjects.emplace_back(subject, marks);
        }

        student.assignSubjects(studentSubjects);

        students.push_back(student);
    }

    // Print totals before sorting
    cout << "Before Sorting\n";
    cout << "--------------\n";

    for (const auto& student : students) {
        cout << student.name
             << " Total Marks = "
             << student.calculateTotalMarks()
             << endl;
    }

    // Sort descending by total marks
    sort(
        students.begin(),
        students.end(),
        [](const Student& a, const Student& b) {
            return a.calculateTotalMarks() >
                   b.calculateTotalMarks();
        });

    // Assign ranks with tie handling
    for (int i = 0; i < students.size(); i++) {

        if (i > 0 &&
            students[i].calculateTotalMarks() ==
            students[i - 1].calculateTotalMarks()) {

            students[i].rank = students[i - 1].rank;
        }
        else {
            students[i].rank = i + 1;
        }
    }

    cout << "\nAfter Sorting and Ranking\n";
    cout << "-------------------------\n";

    for (const auto& student : students) {
        cout << "Rank "
             << student.rank
             << " -> "
             << student.name
             << " Total = "
             << student.calculateTotalMarks()
             << endl;
    }

    // Topper
    const Student& topper = students.front();

    cout << "\nTopper of the Class\n";
    cout << "-------------------\n";

    cout << topper.name
         << " -> Marks : "
         << topper.calculateTotalMarks()
         << endl;

    return 0;
}