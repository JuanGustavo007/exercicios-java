package exer1;

public class Pessoa {
    private String name;
    private String age;
    private String gender;

    public Pessoa(String name, String age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //get a name
    public String getName(){

        return this.name;
    };

    // set a name
    public void setName (String name){

        this.name = name;
    };

    public String getAge(){

        return this.age;
    };

    public void setAge(String age){

        this.age = age;
    };

    public String getGender(){
        return this.gender;
    };

    public void setGender(String gender){

        this.gender =  gender;
    }



}

