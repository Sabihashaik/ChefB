# ChefBot 

A Chatbot made with Watson that suggests a recipe based on the ingredients you have. Itlets you search and create easy recipes using ingredients you already have in your kitchen. 

## Features
  1. Find Recipes based on the ingredients you have
  2. Text to Speech Feature to read out the recipe instructions
    3. Suggests Top Meals that can be made under 15 minutes.

## Screenshots
<img src="https://i.imgur.com/GJ4IHry.jpg" width="230" height="400" /> <img src="https://i.imgur.com/LPFEZdq.jpg" width="230" height="400" />

<h2>Running ChefBot</h2>

Clone the repo and import the code in Android Studio,

## Config.xml 

Navigate to file app/src/main/res/values/config.xml and provide IBM Cloud service credentials 

```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <!-- Watson Conversation Service Credentials --> 
    <string name="workspace_id">ENTER_YOUR_ID</string> 
    <string name="conversation_username">ENTER_YOUR_USERNAME</string> 
    <string name="conversation_password">ENTER_YOUR_PASSWORD</string>  

    <!--Watson Speech-Toce83a53a-2602-40dc-becf-f45f54615b20-Text Service Credentials--> 
    <string name="STT_username">ENTER_YOUR_USERNAME</string> 
    <string name="STT_password">ENTER_YOUR_PASSWORD</string>  

    <!--Watson Text-To-Speech Service Credentials--> 
    <string name="TTS_username">ENTER_YOUR_USERNAME</string>  
    <string name="TTS_password">ENTER_YOUR_PASSWORD</string>

    <!--Bluemix Mobile Analytics--> 
    <string name="mobileanalytics_apikey">ENTER_YOUR_KEY</string>
</resources>
```

## Configure the App

  <p>To configure  the App you need to get the Watson Conversation service <strong>Username</strong>, <strong>PassWord</strong> and <strong>WorkSpaceId</strong></p>

* In the <strong>MainActivity</strong> class locate the method named <strong>sendMessage()</strong>.

   ```
     ConversationService service = new ConversationService(ConversationService.VERSION_DATE_2016_09_20);

     service.setUsernameAndPassword("Your Watson service UserName", "Your watson service PassWord");

     MessageRequest newMessage = new MessageRequest.Builder().inputText(inputmessage).build();

     MessageResponse response = service.message("Your Workspace Id", newMessage).execute();
   ```

* Go to the Conversation service , and select the <strong>Service Credentials</strong> tab. Select <strong>password</strong> and <strong>username</strong>.

 </p>Add the `password` and `username` in config.xml ,</p>

 ```
 service.setUsernameAndPassword("Your Watson service UserName", "Your watson service PassWord");

 ```

<p>Get the <strong>Workspace ID:</strong> and add it in config.xml,</p>

```
MessageResponse response = service.message("Your Workspace Id", newMessage).execute();
```

* Build and Run your app.


