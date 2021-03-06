package com.example.xinbank;

import java.util.Date;

public class messageHelperClass {
    Long timestamp;
    String imei;
    Boolean accessControl;
    String otu;

    public messageHelperClass() {
    }

    public messageHelperClass(Long timestamp, String imei, Boolean accessControl, String otu) {
        this.timestamp = timestamp;
        this.imei = imei;
        this.accessControl = accessControl;
        this.otu = otu;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp() {
        generateTimestamp();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Boolean getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(Boolean accessControl) {
        this.accessControl = accessControl;
    }

    public String getOtu() {
        return otu;
    }

    public void setOtu(String otu) {
        this.otu = otu;
    }

    @Override
    public String toString() {
        return "Your Message: " + '\'' +
                "timestamp='" + timestamp + '\'' +
                ", imei='" + imei + '\'' +
                ", accessControl=" + accessControl + '\'' +
                ", otu='" + otu + '\'' ;
    }
    private void generateTimestamp(){
        Date date = new Date();
        timestamp = date.getTime();
        /*
        int isvalid=0 ;
        long timemilli = date.getTime();
        long time1 = 1604905537087L ;
        long result = timemilli - time1;
        long sec = result / 1000 % 60;
        long minu = result / (60 * 1000) % 60;
        long hour = result / (60 * 60 * 1000);
        long day = result / (1000 * 60 * 60 * 24);
       // showing.setText("time now = "+timemilli + "result = "+result + "\n in day = "+ day +"\n in hour = "+ hour +"\n in minute = "+ minu +"\n in second = "+ sec);
        if (day == 0){if(hour==0){if(minu < 5){isvalid = 1; }}}

        */
        //showing.setText("time now = "+timemilli + "result = "+result + "\n in day = "+ day +"\n in hour = "+ hour +"\n in minute = "+ minu +"\n in second = "+ sec +"\n validity = "+isvalid);
    }
}
