package com.chatbox.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {
    private String projector;

	    private String primaryuser;

	    private String userID;

	    private String username;

	    private String numberofparticipant;
	    
	    private String starttime;

	    private String endtime;

	    private String purpose;

	    private String tea;

	    private String date;

	    private String room;
	    
	    private String phone;

	    public String getProjector ()
	    {
	        return projector;
	    }

	    public void setProjector (String projector)
	    {
	        this.projector = projector;
	    }

	    public String getPrimaryuser ()
	    {
	        return primaryuser;
	    }

	    public void setPrimaryuser (String primaryuser)
	    {
	        this.primaryuser = primaryuser;
	    }

	    public String getUserID ()
	    {
	        return userID;
	    }

	    public void setUserID (String userID)
	    {
	        this.userID = userID;
	    }

	    public String getUsername ()
	    {
	        return username;
	    }

	    public void setUsername (String username)
	    {
	        this.username = username;
	    }

	    public String getStarttime() {
			return starttime;
		}

		public void setStarttime(String starttime) {
			this.starttime = starttime;
		}

		public String getEndtime() {
			return endtime;
		}

		public void setEndtime(String endtime) {
			this.endtime = endtime;
		}

		public String getNumberofparticipant ()
	    {
	        return numberofparticipant;
	    }

	    public void setNumberofparticipant (String numberofparticipant)
	    {
	        this.numberofparticipant = numberofparticipant;
	    }

	    public String getPurpose ()
	    {
	        return purpose;
	    }

	    public void setPurpose (String purpose)
	    {
	        this.purpose = purpose;
	    }

	    public String getTea ()
	    {
	        return tea;
	    }

	    public void setTea (String tea)
	    {
	        this.tea = tea;
	    }

	    public String getDate ()
	    {
	        return date;
	    }

	    public void setDate (String date)
	    {
	        this.date = date;
	    }

	    public String getRoom ()
	    {
	        return room;
	    }

	    public void setRoom (String room)
	    {
	        this.room = room;
	    }

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Parameters [projector=" + projector + ", primaryuser=" + primaryuser + ", userID=" + userID
					+ ", username=" + username + ", numberofparticipant=" + numberofparticipant + ", starttime="
					+ starttime + ", endtime=" + endtime + ", purpose=" + purpose + ", tea=" + tea + ", date=" + date
					+ ", room=" + room + "]";
		}
}
