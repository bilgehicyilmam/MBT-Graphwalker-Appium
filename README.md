# Model Based Testing with Graphwalker and Appium

This repository includes the tests of Notepad application on an Android device. I have used Graphwalker with an Appium to test the application.

## Graphwalker with Appium 

1) Using yEd graph editor, I drew the graph below. After downloading the graphml file, I have added to 'src/main/resources' file in IDE. 

![notepad](https://user-images.githubusercontent.com/61224886/100847669-27595400-3491-11eb-8759-244a829c29f0.png)

2) I run the commands below in the terminal. By using the following commands, graphwalker generates the interface 'myNotepad'. The class 'automation' implements this interface. 

```
mvn graphwalker:generate-sources
mvn graphwalker:test
```

### To execute the project

1) Start android emulator.
2) Start Appium.
3) Run command ``mvn graphwalker:test`` in the terminal.


## Result

![image](https://user-images.githubusercontent.com/61224886/100851603-7a81d580-3496-11eb-99c1-d215af603440.png)
