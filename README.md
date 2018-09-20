# EC463 Mini Project 1

This miniproject simulates a temperature and humidity monitor using an Android app as a controller to see simulated sensor values. This project demonstrates multiple skills including use of API's (Using Google Authentication and Firestore), a cloud datastore (Google Firestore), agile development along with other skills.


## Getting Started

To run the app on a live Android device, simply download the .apk file (EC463swmp1-release.apk) onto your device and "allow installation from unknown sources." 

To run the app on an emulator, download Android Studio and use the VCS function -> import from version control -> import from github and enter https://github.com/jeefle/ec463_swminiproj.git -> clone. 

This will clone the repository. After, click on Run, and run the app on an emulator (Android 21 and up)

## Database Design

The database used was a NoSQL type database with a collection/document structure. This allows us to more easily parse to create time series plots. While both SQL and NoSQL databases are viable options, we were in favor of NoSQL for the ease of use and deploymet speed.

Our database was created using the nested collection/document structure in the following manner:

```
collection: rooms
	document: room0
		collection: climate
			document: humidity
				00:00: 50
				01:00: 22
				...
			document: temperature
				00:00: 13
				01:00: 96
				...
	document: room1
		collection: climate
			document: humidity
				...
			...
		...
	...
```

## Unit Tests

The main functions of this app are to login, select a room, and view the room's temperature and humidity plots.

Login Tested:
```
Signing in using Google Sign-in - Confirms that the app recognizes sign in
Invalid Login (Bad credentials) - Confirms that not everyone can enter the app with random credentials
Having an account signed in already - Better UX where user doesn't have to sign in every time
```
Selecting a Room Tested:
```
Clicking on specific room - Confirms MVP functionality
```
Viewing Temp/Humidity Plots Tested
```
Select Temp - Confirms MVP functionality (Temp plot is displayed)
Select Humidity - Confirms MVP functionality (Humidity plot is displayed)
```
Concurrent Users Tested:
```
App was loaded on a live device and an android emulator and used concurrently
```

The app has passed all these tests.

## Individual Contributions

Jeff: Set up Cloud Database, Implemented Authentication, Created Query Example, Optomized UI

Tariq: Queried Data Set, Plotted queried data, Optimized UI

Both: Built UI, Testing, Integration 

## Built With

* Android Studio - IDE
* Google Sign-In - Authentication
* Google Cloud Firestore - Cloud database
* MPAndroid Chart - Plotting Library

## Authors

* **Jeffrey Leong** - jeefle@bu.edu
* **Tariq Ahsan** - tahsan@bu.edu

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
