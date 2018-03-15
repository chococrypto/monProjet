package domaine;

import java.util.Date;

/**
 * Created by diegoruiz on 04.03.18.
 */
abstract public class Persone implements Comparable{

    private int num; //required
    private String email,phone,firstName,lastName; //required
    private Date dateNaissance;//require

    //# normal Builder
    public Persone(int num, String email, String phone, String firstName, String lastName, Date dateNaissance) {
        this.num = num;
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateNaissance = dateNaissance;
    }

    //# Accessor
    //getter
    public int getNum() {return num;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public Date getDateNaissance() {return dateNaissance;}
    //setter
    public void setEmail(String email) {this.email = email;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setDateNaissance(Date dateNaissance) {this.dateNaissance = dateNaissance;}

    //# Comparison
    //Equals
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Persone){
            Persone p = (Persone) obj;
            if(num == p.num && email.equals(email) && phone.equals(phone)){
               return true;
            }
        }
        return false;
    }
    //CompareTo
    @Override
    public int compareTo(Object o) {
        Persone p = (Persone) o;
        int res = lastName.compareTo(p.lastName);
        if(res != 0){return res;}
        res = firstName.compareTo(p.firstName);
        if(res != 0){ return res;}
        return email.compareTo(p.email);
    }
    //# Description
    @Override
    public String toString() {
        return "num:" + num + ";email:" + email +
                "phone:" + phone +
                ";firstName:" + firstName +
                ";lastName:" + lastName +
                ";dateNaissance:" + dateNaissance.toString();
    }
}
