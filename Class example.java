/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5.pranav;

interface student{
    String name="Thor";
    String id="19";
    float gpa= (float) 9.2;
    public void getName();
    public void getGpa();
    public void setId();
    public void getId();
    public String toString();

}
interface Undergraduate{
    int year = 2019;
    public void setYear();
    public void getYear();
    public String toString();
}
interface Graduate{
    String thesisTitle="science";
    public void setThesisTitle();
    public void getThesisTitle();
    public String toString();
}
class StudentDetail implements student,Undergraduate,Graduate{

    @Override
    public void getName() {
        System.out.println("Name:"+name);
    }

    @Override
    public void getGpa() {
        System.out.println("Gpa:"+gpa);
    }

    @Override
    public void setId() {
        String id="19bce10442";
    }

    @Override
    public void getId() {
        System.out.println("id:"+id);
    }

    @Override
    public void setYear() {
        int Year=2019;
    }

   //Override
    public void getYear() {
        System.out.println("year is:"+year);
    }

    @Override
    public void setThesisTitle() {
        String thesisTitle="science";
    }

    @Override
    public void getThesisTitle() {
        System.out.println("thesisTitle:"+thesisTitle);
    }
}
public class Exp {
    public static void main(String args[]){
        StudentDetail sd=new StudentDetail();
        sd.getName();
        sd.setId();
        sd.getId();
        sd.getGpa();
        sd.getYear();
        sd.getThesisTitle();

    }


}

