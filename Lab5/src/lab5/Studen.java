/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.Serializable;

/**
 *
 * @author 98tae
 */
public class Studen  implements Serializable {

        public String name;
        public double marks;
        public String major;

    public Studen() {
    }

    public Studen(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

        

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMarks() {
            return marks;
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }
        
        public String getGrade() {
            if (this.marks < 3) {
                return "Kém";
            }
            if (this.marks < 5) {
                return "Yếu";
            }
            if (this.marks < 6.5) {
                return "trung bình";
            }
            if (this.marks < 7.5) {
                return "Khá";
            }
            if (this.marks < 9) {
                return "Gioi";
            }
            return "Xuất Xắc";
        }

        public boolean isBonus() {
            return this.marks >= 7.5;
        }

    
    
}
