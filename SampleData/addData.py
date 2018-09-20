"""
Sample dataset for EC463 miniproject 1
Created by Jeffrey Leong 9/16/2018
Set up path variable after getting API key from Google console.
Data is uploaded onto Google Cloud Datastore.
This script generates data to simulate temperature and humidity in a room.
It is randomized using the random library.
"""

from google.cloud import firestore
import random

db = firestore.Client()

room0_ref = db.collection(u'rooms').document(u'room0')
room1_ref = db.collection(u'rooms').document(u'room1')
room2_ref = db.collection(u'rooms').document(u'room2')
room3_ref = db.collection(u'rooms').document(u'room3')
room4_ref = db.collection(u'rooms').document(u'room4')
room5_ref = db.collection(u'rooms').document(u'room5')
room6_ref = db.collection(u'rooms').document(u'room6')
room7_ref = db.collection(u'rooms').document(u'room7')
room8_ref = db.collection(u'rooms').document(u'room8')
room9_ref = db.collection(u'rooms').document(u'room9')
room10_ref = db.collection(u'rooms').document(u'room10')

# sets temperature readings
climate0_ref = room0_ref.collection(u'climate').document(u'temp0')
climate1_ref = room1_ref.collection(u'climate').document(u'temp1')
climate2_ref = room2_ref.collection(u'climate').document(u'temp2')
climate3_ref = room3_ref.collection(u'climate').document(u'temp3')
climate4_ref = room4_ref.collection(u'climate').document(u'temp4')
climate5_ref = room5_ref.collection(u'climate').document(u'temp5')
climate6_ref = room6_ref.collection(u'climate').document(u'temp6')
climate7_ref = room7_ref.collection(u'climate').document(u'temp7')
climate8_ref = room8_ref.collection(u'climate').document(u'temp8')
climate9_ref = room9_ref.collection(u'climate').document(u'temp9')
climate10_ref = room10_ref.collection(u'climate').document(u'temp10')

counter = 0

for rooms in range(0,11):
	data = {
		u'00:00': random.randint(15,30),
		u'01:00': random.randint(15,30),
		u'02:00': random.randint(15,30),
		u'03:00': random.randint(15,30),
		u'04:00': random.randint(15,30),
		u'05:00': random.randint(15,30),
		u'06:00': random.randint(15,30),
		u'07:00': random.randint(15,30),
		u'08:00': random.randint(15,30),
		u'09:00': random.randint(15,30),
		u'10:00': random.randint(15,30),
		u'11:00': random.randint(15,30),
		u'12:00': random.randint(15,30),
		u'13:00': random.randint(15,30),
		u'14:00': random.randint(15,30),
		u'15:00': random.randint(15,30),
		u'16:00': random.randint(15,30),
		u'17:00': random.randint(15,30),
		u'18:00': random.randint(15,30),
		u'19:00': random.randint(15,30),
		u'20:00': random.randint(15,30),
		u'21:00': random.randint(15,30),
		u'22:00': random.randint(15,30),
		u'23:00': random.randint(15,30)
		}
	if counter == 0:
		climate0_ref.set(data)
	if counter == 1:
		climate1_ref.set(data)
	if counter == 2:
		climate2_ref.set(data)
	if counter == 3:
		climate3_ref.set(data)
	if counter == 4:
		climate4_ref.set(data)
	if counter == 5:
		climate5_ref.set(data)
	if counter == 6:
		climate6_ref.set(data)
	if counter == 7:
		climate7_ref.set(data)
	if counter == 8:
		climate8_ref.set(data)
	if counter == 9:
		climate9_ref.set(data)
	if counter == 10:
		climate10_ref.set(data)

	counter += 1

# sets humidity readings
climate0_ref = room0_ref.collection(u'climate').document(u'hum0')
climate1_ref = room1_ref.collection(u'climate').document(u'hum1')
climate2_ref = room2_ref.collection(u'climate').document(u'hum2')
climate3_ref = room3_ref.collection(u'climate').document(u'hum3')
climate4_ref = room4_ref.collection(u'climate').document(u'hum4')
climate5_ref = room5_ref.collection(u'climate').document(u'hum5')
climate6_ref = room6_ref.collection(u'climate').document(u'hum6')
climate7_ref = room7_ref.collection(u'climate').document(u'hum7')
climate8_ref = room8_ref.collection(u'climate').document(u'hum8')
climate9_ref = room9_ref.collection(u'climate').document(u'hum9')
climate10_ref = room10_ref.collection(u'climate').document(u'hum10')

counter = 0

for rooms in range(0,11):
	data = {
		u'00:00': random.randint(0,100),
		u'01:00': random.randint(0,100),
		u'02:00': random.randint(0,100),
		u'03:00': random.randint(0,100),
		u'04:00': random.randint(0,100),
		u'05:00': random.randint(0,100),
		u'06:00': random.randint(0,100),
		u'07:00': random.randint(0,100),
		u'08:00': random.randint(0,100),
		u'09:00': random.randint(0,100),
		u'10:00': random.randint(0,100),
		u'11:00': random.randint(0,100),
		u'12:00': random.randint(0,100),
		u'13:00': random.randint(0,100),
		u'14:00': random.randint(0,100),
		u'15:00': random.randint(0,100),
		u'16:00': random.randint(0,100),
		u'17:00': random.randint(0,100),
		u'18:00': random.randint(0,100),
		u'19:00': random.randint(0,100),
		u'20:00': random.randint(0,100),
		u'21:00': random.randint(0,100),
		u'22:00': random.randint(0,100),
		u'23:00': random.randint(0,100)
		}
	if counter == 0:
		climate0_ref.set(data)
	if counter == 1:
		climate1_ref.set(data)
	if counter == 2:
		climate2_ref.set(data)
	if counter == 3:
		climate3_ref.set(data)
	if counter == 4:
		climate4_ref.set(data)
	if counter == 5:
		climate5_ref.set(data)
	if counter == 6:
		climate6_ref.set(data)
	if counter == 7:
		climate7_ref.set(data)
	if counter == 8:
		climate8_ref.set(data)
	if counter == 9:
		climate9_ref.set(data)
	if counter == 10:
		climate10_ref.set(data)

	counter += 1
