s1= int(input("Enter Marks 1:"))
s2= int(input("Enter Marks 2:"))
s3= int(input("Enter Marks 3:"))
s4= int(input("Enter Marks 4:"))
s5= int(input("Enter Marks 5:"))
s6= int(input("Enter Marks 6:"))
float sum=s1+s2+s3+s4+s5+s6;
float avg=sum/6;

if(avg>=85):
  print(RANK1)
elif(avg>=60&avg<85):
 print(Rank2)
elif(avg>=50&avg<60):
  print(secondclass)
elif(avg>=40&avg<50):
 print(justpass)
else:
 print(fail)
 
