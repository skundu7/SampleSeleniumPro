$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FamilyMember.feature");
formatter.feature({
  "line": 2,
  "name": "verify Family Members in my profile page",
  "description": "",
  "id": "verify-family-members-in-my-profile-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MyFamilyMembers"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "User Login to the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Myaccount link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters the mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the proceed link again",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should get logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 16400739157,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 199947056,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_Myaccount_link()"
});
formatter.result({
  "duration": 11053637219,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 196065241,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_button()"
});
formatter.result({
  "duration": 288593313,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_password()"
});
formatter.result({
  "duration": 3119382177,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_link_again()"
});
formatter.result({
  "duration": 270934625,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_should_get_logged_in()"
});
formatter.result({
  "duration": 5521173363,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User verifies family members",
  "description": "",
  "id": "verify-family-members-in-my-profile-page;user-verifies-family-members",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user clicks on \"My Profile\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user should be on \"My Profile\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user should see saved family members",
  "rows": [
    {
      "cells": [
        "Member 1"
      ],
      "line": 18
    },
    {
      "cells": [
        "Member 2"
      ],
      "line": 19
    },
    {
      "cells": [
        "Member 3"
      ],
      "line": 20
    },
    {
      "cells": [
        "Member 4"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should see details of family members",
  "rows": [
    {
      "cells": [
        "Member1"
      ],
      "line": 23
    },
    {
      "cells": [
        "Member2"
      ],
      "line": 24
    },
    {
      "cells": [
        "Member3"
      ],
      "line": 25
    },
    {
      "cells": [
        "Member4"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "My Profile",
      "offset": 16
    }
  ],
  "location": "commonStepdefs.user_clicks_on_tab(String)"
});
formatter.result({
  "duration": 9634757834,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Profile",
      "offset": 19
    }
  ],
  "location": "commonStepdefs.user_should_be_on_page(String)"
});
formatter.result({
  "duration": 18544788,
  "status": "passed"
});
formatter.match({
  "location": "MyProfilestepdefs.user_should_see_saved_family_members(String\u003e)"
});
formatter.result({
  "duration": 4075644293,
  "status": "passed"
});
formatter.match({
  "location": "MyProfilestepdefs.user_should_see_details_of_family_members(String\u003e)"
});
formatter.result({
  "duration": 1542371744,
  "status": "passed"
});
formatter.after({
  "duration": 3162062900,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login into the appliation",
  "description": "",
  "id": "login-into-the-appliation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "User has launched the app",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 14386624437,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 157510096,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login to the application",
  "description": "",
  "id": "login-into-the-appliation;login-to-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user clicks on Myaccount link",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enters the mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the proceed link again",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should get logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_Myaccount_link()"
});
formatter.result({
  "duration": 9978318370,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 210590081,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_button()"
});
formatter.result({
  "duration": 255344499,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_password()"
});
formatter.result({
  "duration": 3130383148,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_link_again()"
});
formatter.result({
  "duration": 274738607,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_should_get_logged_in()"
});
formatter.result({
  "duration": 5688634112,
  "status": "passed"
});
formatter.after({
  "duration": 1971519528,
  "status": "passed"
});
formatter.uri("MyProfile.feature");
formatter.feature({
  "line": 2,
  "name": "verify My profile funtionality",
  "description": "",
  "id": "verify-my-profile-funtionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MyProfile"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "User Login to the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Myaccount link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters the mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the proceed link again",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should get logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 14020294320,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 135384134,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_Myaccount_link()"
});
formatter.result({
  "duration": 9085368717,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 259522251,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_button()"
});
formatter.result({
  "duration": 255289331,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_password()"
});
formatter.result({
  "duration": 3133989554,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_link_again()"
});
formatter.result({
  "duration": 267976115,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_should_get_logged_in()"
});
formatter.result({
  "duration": 7358459145,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User is able to add family member in his profile",
  "description": "",
  "id": "verify-my-profile-funtionality;user-is-able-to-add-family-member-in-his-profile",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user clicks on \"My Profile\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user clicks on Add Family members button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters Name for \"Member1\" of the family",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters date for \"Member1\" using calendar",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user enters Relation for \"Member1\" of the family member",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user cliks on Save",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "My Profile",
      "offset": 16
    }
  ],
  "location": "commonStepdefs.user_clicks_on_tab(String)"
});
formatter.result({
  "duration": 8232048475,
  "status": "passed"
});
formatter.match({
  "location": "MyProfilestepdefs.user_clicks_on_Add_Family_members_button()"
});
formatter.result({
  "duration": 3954078515,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Member1",
      "offset": 22
    }
  ],
  "location": "MyProfilestepdefs.user_enters_Name_for_of_the_family(String)"
});
formatter.result({
  "duration": 603374446,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Member1",
      "offset": 22
    }
  ],
  "location": "commonStepdefs.user_enters_date_for_using_calendar(String)"
});
formatter.result({
  "duration": 60653223933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Member1",
      "offset": 26
    }
  ],
  "location": "MyProfilestepdefs.user_enters_Relation_for_of_the_family_member(String)"
});
formatter.result({
  "duration": 188081369,
  "status": "passed"
});
formatter.match({
  "location": "MyProfilestepdefs.user_cliks_on_Save()"
});
formatter.result({
  "duration": 366568320,
  "status": "passed"
});
formatter.after({
  "duration": 2018474652,
  "status": "passed"
});
formatter.uri("MyVehicle.feature");
formatter.feature({
  "line": 2,
  "name": "Verify My vehile",
  "description": "",
  "id": "verify-my-vehile",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MyVehicle"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "User Login to the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Myaccount link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters the mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the proceed link again",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should get logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 15395142022,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 199091748,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_Myaccount_link()"
});
formatter.result({
  "duration": 10245407958,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 143170857,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_button()"
});
formatter.result({
  "duration": 270096423,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_password()"
});
formatter.result({
  "duration": 3130953211,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_link_again()"
});
formatter.result({
  "duration": 277531188,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_should_get_logged_in()"
});
formatter.result({
  "duration": 5529124306,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User is able to see all his policies",
  "description": "",
  "id": "verify-my-vehile;user-is-able-to-see-all-his-policies",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user clicks on \"My Vehicle\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user adds  \"I20\" in the vehile list",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters \"ExpiryDate\" for  type \"Cars\" and model \"I20\" using Calendar",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "vehicle \"I20\" should get added",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "My Vehicle",
      "offset": 16
    }
  ],
  "location": "commonStepdefs.user_clicks_on_tab(String)"
});
formatter.result({
  "duration": 8149984669,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I20",
      "offset": 12
    }
  ],
  "location": "NewVehiclestepdefs.user_adds_in_the_vehile_list(String)"
});
formatter.result({
  "duration": 24579628958,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: HYUNDAI\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027LENOVO-PC\u0027, ip: \u0027192.168.0.2\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat com.atdd.SampleProject.pages.NewVehicle.addnewvehicle(NewVehicle.java:77)\r\n\tat com.atdd.SampleProject.stepdefs.NewVehiclestepdefs.user_adds_in_the_vehile_list(NewVehiclestepdefs.java:18)\r\n\tat ✽.When user adds  \"I20\" in the vehile list(MyVehicle.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "ExpiryDate",
      "offset": 13
    },
    {
      "val": "Cars",
      "offset": 36
    },
    {
      "val": "I20",
      "offset": 53
    }
  ],
  "location": "NewVehiclestepdefs.user_enters_for_type_and_model_using_Calendar(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "I20",
      "offset": 9
    }
  ],
  "location": "NewVehiclestepdefs.vehicle_should_get_added(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1955402959,
  "status": "passed"
});
formatter.uri("Mypolicies.feature");
formatter.feature({
  "line": 2,
  "name": "Verify my Policies",
  "description": "",
  "id": "verify-my-policies",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Policies"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "User Login to the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Myaccount link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters the mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the proceed link again",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should get logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 15009243313,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 137192255,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_Myaccount_link()"
});
formatter.result({
  "duration": 13149891440,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 181850022,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_button()"
});
formatter.result({
  "duration": 267026295,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_password()"
});
formatter.result({
  "duration": 3126334976,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_link_again()"
});
formatter.result({
  "duration": 325803488,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_should_get_logged_in()"
});
formatter.result({
  "duration": 5544602386,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User is able to see all his policies",
  "description": "",
  "id": "verify-my-policies;user-is-able-to-see-all-his-policies",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user clicks on \"My Policies\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user should see all his policies",
  "rows": [
    {
      "cells": [
        "New India Assurance"
      ],
      "line": 17
    },
    {
      "cells": [
        "National Insurance"
      ],
      "line": 18
    },
    {
      "cells": [
        "Iffco TOKIO"
      ],
      "line": 19
    },
    {
      "cells": [
        "Bharti AXA"
      ],
      "line": 20
    },
    {
      "cells": [
        "HDFC ERGO"
      ],
      "line": 21
    },
    {
      "cells": [
        "Bharti AXA"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "My Policies",
      "offset": 16
    }
  ],
  "location": "commonStepdefs.user_clicks_on_tab(String)"
});
formatter.result({
  "duration": 7789967152,
  "status": "passed"
});
formatter.match({
  "location": "Policystepdefs.user_should_see_all_his_policies(String\u003e)"
});
formatter.result({
  "duration": 4330689433,
  "status": "passed"
});
formatter.after({
  "duration": 2011271249,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User Login to the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Myaccount link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters the mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the proceed link again",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should get logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 15048665741,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 186502898,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_Myaccount_link()"
});
formatter.result({
  "duration": 10938392594,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 226694248,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_button()"
});
formatter.result({
  "duration": 283056905,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_password()"
});
formatter.result({
  "duration": 3137544642,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_link_again()"
});
formatter.result({
  "duration": 267104984,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_should_get_logged_in()"
});
formatter.result({
  "duration": 5496972424,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User should be able to see his car policies",
  "description": "",
  "id": "verify-my-policies;user-should-be-able-to-see-his-car-policies",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user clicks on \"My Policies\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user selects the car tab",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should see all his car policies",
  "rows": [
    {
      "cells": [
        "National Insurance"
      ],
      "line": 28
    },
    {
      "cells": [
        "Iffco TOKIO"
      ],
      "line": 29
    },
    {
      "cells": [
        "Bharti AXA"
      ],
      "line": 30
    },
    {
      "cells": [
        "Bharti AXA"
      ],
      "line": 31
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "My Policies",
      "offset": 16
    }
  ],
  "location": "commonStepdefs.user_clicks_on_tab(String)"
});
formatter.result({
  "duration": 7659130691,
  "status": "passed"
});
formatter.match({
  "location": "Policystepdefs.user_selects_the_car_tab()"
});
formatter.result({
  "duration": 4250344796,
  "status": "passed"
});
formatter.match({
  "location": "Policystepdefs.user_should_see_all_his_car_policies(String\u003e)"
});
formatter.result({
  "duration": 454123205,
  "status": "passed"
});
formatter.after({
  "duration": 1988393043,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User Login to the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Myaccount link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters the mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the proceed link again",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should get logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 15512116507,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 176592872,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_Myaccount_link()"
});
formatter.result({
  "duration": 11169974499,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 154574252,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_button()"
});
formatter.result({
  "duration": 268229286,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_password()"
});
formatter.result({
  "duration": 3133771450,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_link_again()"
});
formatter.result({
  "duration": 267831568,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_should_get_logged_in()"
});
formatter.result({
  "duration": 5394834966,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User should be able to see his Two wheeler policies",
  "description": "",
  "id": "verify-my-policies;user-should-be-able-to-see-his-two-wheeler-policies",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "user clicks on \"My Policies\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user selects the Two Wheeler tab",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user should see all his two wheeler policies",
  "rows": [
    {
      "cells": [
        "New India Assurance"
      ],
      "line": 37
    },
    {
      "cells": [
        "HDFC ERGO"
      ],
      "line": 38
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "My Policies",
      "offset": 16
    }
  ],
  "location": "commonStepdefs.user_clicks_on_tab(String)"
});
formatter.result({
  "duration": 6308950926,
  "status": "passed"
});
formatter.match({
  "location": "Policystepdefs.user_selects_the_Two_Wheeler_tab()"
});
formatter.result({
  "duration": 4081707144,
  "status": "passed"
});
formatter.match({
  "location": "Policystepdefs.user_should_see_all_his_two_wheeler_policies(String\u003e)"
});
formatter.result({
  "duration": 198990823,
  "status": "passed"
});
formatter.after({
  "duration": 2000607696,
  "status": "passed"
});
formatter.uri("Tabs.feature");
formatter.feature({
  "line": 2,
  "name": "Verify all the tabs are present in the appliation",
  "description": "",
  "id": "verify-all-the-tabs-are-present-in-the-appliation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Tabs"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "User has launched the app",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 15436303290,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 149031428,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify all the tabs are present in the appliation",
  "description": "",
  "id": "verify-all-the-tabs-are-present-in-the-appliation;verify-all-the-tabs-are-present-in-the-appliation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user clicks on Myaccount link",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enters the mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the proceed link again",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should get logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user should see all the below tabs",
  "rows": [
    {
      "cells": [
        "Dashboard"
      ],
      "line": 16
    },
    {
      "cells": [
        "My Policies"
      ],
      "line": 17
    },
    {
      "cells": [
        "My Searches"
      ],
      "line": 18
    },
    {
      "cells": [
        "Help"
      ],
      "line": 19
    },
    {
      "cells": [
        "My Vehicle"
      ],
      "line": 20
    },
    {
      "cells": [
        "My Profile"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_Myaccount_link()"
});
formatter.result({
  "duration": 10150476470,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 183566198,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_button()"
});
formatter.result({
  "duration": 264435568,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_enters_the_password()"
});
formatter.result({
  "duration": 3142422891,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_clicks_on_the_proceed_link_again()"
});
formatter.result({
  "duration": 270951303,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefs.user_should_get_logged_in()"
});
formatter.result({
  "duration": 6813785340,
  "status": "passed"
});
formatter.match({
  "location": "commonStepdefs.user_should_see_all_the_below_tabs(String\u003e)"
});
formatter.result({
  "duration": 5080187261,
  "status": "passed"
});
formatter.after({
  "duration": 1839433461,
  "status": "passed"
});
formatter.uri("launch.feature");
formatter.feature({
  "line": 2,
  "name": "Launch the appliation",
  "description": "",
  "id": "launch-the-appliation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@launch"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Launch the application on firefox browser",
  "description": "",
  "id": "launch-the-appliation;launch-the-application-on-firefox-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user enters the url for the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Launchstepdfs.user_enters_the_url_for_the_app()"
});
formatter.result({
  "duration": 13948355221,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdfs.application_should_get_displayed()"
});
formatter.result({
  "duration": 172049476,
  "status": "passed"
});
formatter.after({
  "duration": 1509741744,
  "status": "passed"
});
});