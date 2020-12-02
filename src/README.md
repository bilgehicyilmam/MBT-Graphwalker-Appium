# Model Based Testing with Graphwalker and Appium

This project includes the tests of Notepad application on an Android device. I have used Graphwalker with an Appium to test the application.

## Test Scenarios

### 1. Creating New Note with Title and Content

It goes to the note creation page and enters title and a content. After sending keys, it clicks on the save button, and goes back to the note list page. When it goes back to the note list page, we can see the title of a note created with a creation date and time. If it clicks on the title of a note, we can see the title and content together.

### 2. Creating New Note with just Title

It goes to the note creation page and enters title. After sending keys, it clicks on the save button, and goes back to the note list page. When it goes back to the note list page, we can see the title of a note created with a creation date and time.

### 3. Creating New Note with just Content

It goes to the note creation page and enters content. After sending keys, it clicks on the save button, and goes back to the note list page.
When it goes back to note list page, title seems blank. We can see just the creation date and time of the note. When it clicks on it, we can see the content.

### 4. Editing the Note Title

It clicks on the title, and goes into the full note view. It enters new words into the title, and clicks on save button. When it goes to the note list page, we can see the title changed.

### 5. Editing the Note Content

It clicks on the title, and goes into the full note view. It enters new words into the content, and clicks on save button. After that, it goes back to the note list page. When it clicks on the title, and goes into the full content view, we can see the content changed.

### 6. Deleting the Note

It clicks on the title, and goes into the full note view. It clears the title and content altogether, and clicks on save button. When it goes back to the note list view, we can see the note still unchanged. Another delete button is also not available in the application. That is why, we can not delete the note.

## Graphwalker 

This is the graph I drew using yEd graph editor.  

![notepad](https://user-images.githubusercontent.com/61224886/100847669-27595400-3491-11eb-8759-244a829c29f0.png)


## Result

![image](https://user-images.githubusercontent.com/61224886/100851603-7a81d580-3496-11eb-99c1-d215af603440.png)
