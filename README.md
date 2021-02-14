# IoT-Medical-Device-.-WebsiteBackend

In this repository we'll be working on the mobile app of the project. 
I'll start making a list of requirements, of what needs to be done, what the backend has to be able to do. Feel free to add new items to the list as you see fitting.

As a starting point this needs to enable users to:
  * Log In
    * Users use their credentials which are then verified in the users database
    * Depending on the type of user that logs in, the user gets a certain view 
  * Design a view for each type of user
  
  <br\>
  
  * There are basically 3 types of users:
    * Patiens, medical staff and admin
      * Patients can only view their own data, and maybe send a notification/alert. They have no create/update/delete privileges.
      * Medical staff can add new users. They can read/update/create notes. The actual data coming from the device cannot be CUD-ed by medical staff.
      * Admin account/s have admin privileges enabling them to make certain modifications. (We still have to properly think about what privileges we give, to make sure the data integrity is mainained)
      
      
      
To be continued...
