*IqraArabic*
===================================

This app displays lists of vocabulary words for the user to learn arabic language.

## App Overview

![IqraArabic Home Screen](http://i.imgur.com/2XcrZ48m.jpg)
![IqraArabic - sub screen view](http://i.imgur.com/wdwiAEym.jpg)


This app is built by taking inspiration from Udacity Nanodegree's 3rd course sample app - ["MultiScreen App"](https://www.udacity.com/course/android-basics-multi-screen-apps--ud839).
It contains following features:
*   All arabic words and phrases in roman english as this app is intended to english speaking user intending to learn arabic.
*   Sound files linked with words for learning arabic pronounciation.
*   Numbers section :- translation of numbers from 1 - 100 in english and arabic (roman).
*   Family relationship words :- translation and sound pronounciation of common relationship terms.
*   Colors section :- translation and sound pronounciation of common color names.
*   Phrases section :- _(underconstruction)_ 

## Code Overview
1.  Use of explicit intents to navigate between pages.
2.  Back button on action bar functionality to go to parent view
3.  Storing all the array raw data in a seperate class for ease of access.
4.  Populating method for respective array list
1.  Custom Data class with different constructors for array adapter.
5.  Custom array adapter to show views based on constructor by overriding "getView".
6.  Single list view and custom array adapter for all layouts.
7.  Based on the constructor used, array adapter hides or shows applicable views.
8.  Use of mediaplayer class for streaming audio to speaker
9.  Judicious release of mediaplayer object when:
    *   playing of audio file is complete by "OncompleteListerner"
    *   user switches to another audio file.
    *   audio focus is lost to another app.
    *   user navigates to parent screen
10. Use of AudioManager class to check for audiofocus change.

Specification
--------------

- Android SDK v23
- Android Build Tools v23.0.2
- Android Support Repository v23.3.0

License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
