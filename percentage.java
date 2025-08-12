class Percentage{
public static void main(String[]args){
int max = 600;
int tamil = 76;
int english = 79;
int maths = 69;
int physics = 72;
int chemistry = 74;
int biology = 69;
int total = tamil + english + maths + physics + chemistry + biology;
float percentage = (float)total/max *100.0f;
System.out.println("Percentage is : "+percentage);
}
}