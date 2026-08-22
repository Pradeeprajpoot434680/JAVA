#include<bits/stdc++.h>
using namespace std;


struct Student {
    string name;
    vector<int>marks;
    char grade;
    int totalMarks;
    int rank;
};

int calculateTotalMarks(vector<int>&marks){
    int sum = 0;
    for(int i=0; i<5;i++){
        sum+= marks[i];
    }

    return sum;
}

int main(){
    vector<Student> students;

    Student s1,s2,s3,s4;

    s1.name="abc";
    vector<int>marks = {67,75,86,45,67};
    s1.marks = marks;

    s2.name="efg";
    vector<int>marks = {87,34,56,46,67};
    s2.marks = marks;


    s3.name="hij";
    vector<int>marks = {89,76,57,87,65};
    s3.marks = marks;

      s4.name="klm";
    vector<int>marks = {96,56,87,97,56};
    s4.marks = marks;


    students.push_back(s1);
    students.push_back(s2);
    students.push_back(s3);
    students.push_back(s4);



    //    for(int i=0; i<4; i++){
    //     cout<<students[i].name;
    //     vector<int>m = students[i].marks;
    //         for(int j=0; j<5; j++){
    //            cout<<m[i];
    //         }
    //    }

    // question 1 
    // Sum the 5-subject score array for each
    // student using std::accumulate — one pass,
    // no manual loop.


    for(int i=0; i<4; i++){
        Student s = students[i];// ith student

        s.totalMarks = calculateTotalMarks(s.marks);
    }

    // question 2

     sort(students.begin(), students.end(), [](const Student& a, const Student& b) {
        return a.totalMarks > b.totalMarks;
    });


    // Compute the grade for each student based on totalMarks
    for(int i=0; i<4; i++){
        Student s = students[i];
        if(s.totalMarks >= 90){
            s.grade = 'A';
        } else if(s.totalMarks >= 80){
            s.grade = 'B';
        } else if(s.totalMarks >= 70){
            s.grade = 'C';
        } else {
            s.grade = 'D';
        }
    }

    // question 
    // Assign ranks based on totalMarks
    sort(students.begin(), students.end(), [](const Student& a, const Student& b) {
        return a.totalMarks > b.totalMarks;
    });
    for(int i=0; i<4; i++){
        students[i].rank = i+1;
    }

    // question 4

    // maximum total marks
    
    return 0;

}