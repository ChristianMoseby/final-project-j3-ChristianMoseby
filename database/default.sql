
INSERT INTO ActivityType (ActivityTypeId, ActivityTypeName) Values (1, "Romantic");
INSERT INTO ActivityType (ActivityTypeId, ActivityTypeName) Values (2, "Adventurous");
INSERT INTO ActivityType (ActivityTypeId, ActivityTypeName) Values (3, "Casual");


INSERT INTO RelationshipStatus (StatusId, StatusName) Values (1, "Newly Dating");
INSERT INTO RelationshipStatus (StatusId, StatusName) Values (2, "It's Serious");
INSERT INTO RelationshipStatus (StatusId, StatusName) Values (3, "We're Married");

INSERT INTO Price (PriceId, PriceName) Values (1, "Free");
INSERT INTO Price (PriceId, PriceName) Values (2, "Inexpensive");
INSERT INTO Price (PriceId, PriceName) Values (3, "Expensive");

INSERT INTO TimeOfDay (TimeOfDayId, TimeOfDayName) Values (1, "Day");
INSERT INTO TimeOfDay (TimeOfDayId, TimeOfDayName) Values (2, "Night");
INSERT INTO TimeOfDay (TimeOfDayId, TimeOfDayName) Values (3, "Any");

INSERT INTO TimeOfYear (TimeOfYearId, TimeOfYearName) Values (1, "Spring/Summer");
INSERT INTO TimeOfYear (TimeOfYearId, TimeOfYearName) Values (2, "Autumn/Winter");


INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (1, "Romantic Dinner", 2,3,3,2,2,'http://oneelevenatthecapital.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (2, "Wine Bar", 3,1,2,2,1,'http://www.zinlr.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (3, "Hiking", 2,2,1,1,1,'https://www.arkansasstateparks.com//park-finder/park.aspx?id=3');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (4,"Dinner Theater",3,1,2,2,2,'http://www.thefivestartheatre.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (5, "River Walk", 2,1,1,3,1,'http://www.northlittlerock.org/attractions_detail/76');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (6, "Picnic at the Park",3,1,2,1,1,'http://www.macarthurparklr.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (7, "Painting With a Twist",3,2,2,3,2,'https://www.paintingwithatwist.com/studio/northlittlerock');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (8,"Holiday Lights Viewing",1,3,2,2,2,'https://www.arkansas.com/travel-tools/seasons/winter/trail-of-lights/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (9,"Indoor Picnic",3,3,1,2,2,'http://www.thekitchn.com/make-winter-better-with-an-indoor-picnic-you-just-need-7-things-240508');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (10,"Bed and Breakfast",1,2,3,3,1,'http://theempress.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (11,"Day Spa Treatment",1,2,3,1,1,'https://thespaah.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values(12,"GoKart Racing",2,1,2,1,1,'http://www.thunderroadgrandprix.com/index.html');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (13,"Staycation",3,3,3,3,1,'https://www.moneycrashers.com/winter-staycation-ideas-tips/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (14,"Live Music", 3,1,2,2,1,'https://www.kingslivemusic.com/music');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (15,"Dance Class", 1,3,2,2,2,'http://www.rcdancecenter.com/curriculum_rock_city_adults.shtml');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (16,"Wine Tasting",1,2,2,1,1,'http://www.wiederkehrwines.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (17, "Horse-Drawn Carriage Ride", 1,1,3,2,2,'http://www.littlerockcarriagecompany.com/#');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (18, "Board Game Night",3,2,1,2,2,'https://www.boardgamequest.com/top-10-couples-date-night-games/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (19, "Coffee & Pastries", 3,1,2,3,2,'http://andina-cafe.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (20, "Cooking Class", 1,2,3,3,1,'https://www.eggshellskitchencompany.com/collections/cooking-classes');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (21, "Couples Massage", 1,3,3,1,1,'https://rejuvenationclinic.com/day-spa/massages/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (22, "Star Gazing", 1,1,1,2,1,'http://www.welovedates.com/date-ideas/outdoor-date-ideas/stargazing/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (23, "Drive-in Movie", 3,1,2,2,1,'https://112driveintheatre.com/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (24, "Bike Ride", 2,2,1,1,1,'http://arkansasrivertrail.org/activities/biking/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (25, "Fishing",3,2,1,1,1,'https://www.arkansas.com/lake/lake-maumelle/49');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (26, "Horseback Riding", 3,1,2,1,1,'http://www.woffordranch.org/');

INSERT INTO Activity (ActivityId, ActivityName, ActivityTypeId, StatusId,PriceId,TimeOfDayId,TimeOfYearId,Website)
Values (27, "Hot Air Balloon Ride", 2,1,3,1,1,'http://www.soaringsports.com/balloon-rides/little-rock/');












