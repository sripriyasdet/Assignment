# Assignment
Assumptions:
  This program splits the strings only on the basis of " "(space) seperator

Steps to run the project:
  1. Import the project in to the eclipse by using File->Import->Git->Projects from git->click Next->Clone URI->click Next->Paste the URI
                                                                            ->click Finish.
  2. Right click on the project->RunAs->Maven Clean (This step is to clean the files and directories generated by Maven during its build)
  3. Right click on the project->Maven->Update project(to sync the eclipse project settings with that of pom)
  4. Now run the "StringTest.java" as Junit test.(You can see all the 5 test cases passed in the junit pane of eclipse).
  
Better solution:
1. We can perform this testing better by using data driven testing with the help of apache poi.jar and getting the data from .xslx files.
2. We can also perform the same action by using the FileReader and inputting the data to the .txt file
