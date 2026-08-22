#include <iostream>
#include <vector>
#include <string>
#include <numeric>
#include <algorithm>
#include <cstdlib>
#include <ctime>

using namespace std;

struct Student {
    string name;
    vector<int> marks;   
    int total;
    int rank;
};

int calculateTotal(const vector<int>& marks) {
    return accumulate(marks.begin(), marks.end(), 0);
}

void generateStudents(vector<Student>& students, int n) {
    for (int i = 1; i <= n; i++) {

        Student s;
        s.name = "Student-" + to_string(i);

        for (int j = 0; j < 5; j++) {
            s.marks.push_back(30 + rand() % 71); // 30-100
        }

        s.total = calculateTotal(s.marks);
        s.rank = 0;

        students.push_back(s);
    }
}

bool compareStudents(const Student& a, const Student& b) {
    return a.total > b.total; // descending
}

void assignRanks(vector<Student>& students) {

    for (int i = 0; i < students.size(); i++) {

        if (i > 0 &&
            students[i].total == students[i - 1].total) {

            students[i].rank = students[i - 1].rank;
        }
        else {
            students[i].rank = i + 1;
        }
    }
}

void printStudents(const vector<Student>& students) {

    for (const auto& s : students) {
        cout << s.name
             << " Total=" << s.total
             << " Rank=" << s.rank
             << endl;
    }
}

Student findTopper(const vector<Student>& students) {
    return students[0];
}

int main() {

    srand(time(nullptr));

    vector<Student> students;

    generateStudents(students, 20);

    sort(
        students.begin(),
        students.end(),
        compareStudents
    );

    assignRanks(students);

    cout << "Students Ranking\n";
    cout << "----------------\n";

    printStudents(students);

    Student topper = findTopper(students);

    cout << "\nTopper of the Class\n";
    cout << topper.name
         << " -> Total Marks = "
         << topper.total
         << endl;

    return 0;
}