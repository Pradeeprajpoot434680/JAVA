#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Student {
    int roll;
    string name;
    int total;
    char grade;
};

// calculate total marks
int getTotal(vector<int> &marks) {
    int sum = 0;
    for (int m : marks) sum += m;
    return sum;
}

// assign grade
char getGrade(int total) {
    if (total >= 450) return 'A';
    else if (total >= 350) return 'B';
    else if (total >= 250) return 'C';
    else if (total >= 150) return 'D';
    else return 'F';
}

int main() {
    int n;
    cout << "Enter number of students: ";
    cin >> n;

    vector<Student> s(n);
    vector<int> marks(5);

    // input
    for (int i = 0; i < n; i++) {
        cout << "\nEnter roll and name: ";
        cin >> s[i].roll >> s[i].name;

        cout << "Enter 5 marks: ";
        for (int j = 0; j < 5; j++) {
            cin >> marks[j];
        }

        s[i].total = getTotal(marks);
        s[i].grade = getGrade(s[i].total);
    }

    // sort by total marks (descending)
    sort(s.begin(), s.end(), [](Student a, Student b) {
        return a.total > b.total;
    });

    // assign rank
    s[0].count = 1;
    for (int i = 1; i < n; i++) {
        if (s[i].total == s[i - 1].total)
            s[i].count = s[i - 1].count;
        else
            s[i].count = i + 1;
    }

    // output
    cout << "\n--- RESULT ---\n";
    for (auto &st : s) {
        cout << st.roll << " "
             << st.name << " "
             << "Total: " << st.total << " "
             << "Grade: " << st.grade << "\n";
    }

    return 0;
}