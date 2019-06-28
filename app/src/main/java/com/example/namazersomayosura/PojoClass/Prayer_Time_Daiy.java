package com.example.namazersomayosura.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Prayer_Time_Daiy {
    public Prayer_Time_Daiy() {
    }

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private Data data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Designation_ {

        @SerializedName("abbreviated")
        @Expose
        private String abbreviated;
        @SerializedName("expanded")
        @Expose
        private String expanded;

        public String getAbbreviated() {
            return abbreviated;
        }

        public void setAbbreviated(String abbreviated) {
            this.abbreviated = abbreviated;
        }

        public String getExpanded() {
            return expanded;
        }

        public void setExpanded(String expanded) {
            this.expanded = expanded;
        }

    }

    public class Designation {

        @SerializedName("abbreviated")
        @Expose
        private String abbreviated;
        @SerializedName("expanded")
        @Expose
        private String expanded;

        public String getAbbreviated() {
            return abbreviated;
        }

        public void setAbbreviated(String abbreviated) {
            this.abbreviated = abbreviated;
        }

        public String getExpanded() {
            return expanded;
        }

        public void setExpanded(String expanded) {
            this.expanded = expanded;
        }

    }

    public class Date {

        @SerializedName("readable")
        @Expose
        private String readable;
        @SerializedName("timestamp")
        @Expose
        private String timestamp;
        @SerializedName("hijri")
        @Expose
        private Hijri hijri;
        @SerializedName("gregorian")
        @Expose
        private Gregorian gregorian;

        public String getReadable() {
            return readable;
        }

        public void setReadable(String readable) {
            this.readable = readable;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public Hijri getHijri() {
            return hijri;
        }

        public void setHijri(Hijri hijri) {
            this.hijri = hijri;
        }

        public Gregorian getGregorian() {
            return gregorian;
        }

        public void setGregorian(Gregorian gregorian) {
            this.gregorian = gregorian;
        }

    }

    public class Data {

        @SerializedName("timings")
        @Expose
        private Timings timings;
        @SerializedName("date")
        @Expose
        private Date date;
        @SerializedName("meta")
        @Expose
        private Meta meta;

        public Timings getTimings() {
            return timings;
        }

        public void setTimings(Timings timings) {
            this.timings = timings;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

    }

    public class Gregorian {

        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("format")
        @Expose
        private String format;
        @SerializedName("day")
        @Expose
        private String day;
        @SerializedName("weekday")
        @Expose
        private Weekday_ weekday;
        @SerializedName("month")
        @Expose
        private Month_ month;
        @SerializedName("year")
        @Expose
        private String year;
        @SerializedName("designation")
        @Expose
        private Designation_ designation;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public Weekday_ getWeekday() {
            return weekday;
        }

        public void setWeekday(Weekday_ weekday) {
            this.weekday = weekday;
        }

        public Month_ getMonth() {
            return month;
        }

        public void setMonth(Month_ month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public Designation_ getDesignation() {
            return designation;
        }

        public void setDesignation(Designation_ designation) {
            this.designation = designation;
        }

    }

    public class Hijri {

        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("format")
        @Expose
        private String format;
        @SerializedName("day")
        @Expose
        private String day;
        @SerializedName("weekday")
        @Expose
        private Weekday weekday;
        @SerializedName("month")
        @Expose
        private Month month;
        @SerializedName("year")
        @Expose
        private String year;
        @SerializedName("designation")
        @Expose
        private Designation designation;
        @SerializedName("holidays")
        @Expose
        private List<Object> holidays = null;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public Weekday getWeekday() {
            return weekday;
        }

        public void setWeekday(Weekday weekday) {
            this.weekday = weekday;
        }

        public Month getMonth() {
            return month;
        }

        public void setMonth(Month month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public Designation getDesignation() {
            return designation;
        }

        public void setDesignation(Designation designation) {
            this.designation = designation;
        }

        public List<Object> getHolidays() {
            return holidays;
        }

        public void setHolidays(List<Object> holidays) {
            this.holidays = holidays;
        }

    }

    public class Meta {

        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("longitude")
        @Expose
        private Double longitude;
        @SerializedName("timezone")
        @Expose
        private String timezone;
        @SerializedName("method")
        @Expose
        private Method method;
        @SerializedName("latitudeAdjustmentMethod")
        @Expose
        private String latitudeAdjustmentMethod;
        @SerializedName("midnightMode")
        @Expose
        private String midnightMode;
        @SerializedName("school")
        @Expose
        private String school;
        @SerializedName("offset")
        @Expose
        private Offset offset;

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getLatitudeAdjustmentMethod() {
            return latitudeAdjustmentMethod;
        }

        public void setLatitudeAdjustmentMethod(String latitudeAdjustmentMethod) {
            this.latitudeAdjustmentMethod = latitudeAdjustmentMethod;
        }

        public String getMidnightMode() {
            return midnightMode;
        }

        public void setMidnightMode(String midnightMode) {
            this.midnightMode = midnightMode;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public Offset getOffset() {
            return offset;
        }

        public void setOffset(Offset offset) {
            this.offset = offset;
        }

    }

    public class Method {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("params")
        @Expose
        private Params params;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Params getParams() {
            return params;
        }

        public void setParams(Params params) {
            this.params = params;
        }

    }

    public class Month {

        @SerializedName("number")
        @Expose
        private Integer number;
        @SerializedName("en")
        @Expose
        private String en;
        @SerializedName("ar")
        @Expose
        private String ar;

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getAr() {
            return ar;
        }

        public void setAr(String ar) {
            this.ar = ar;
        }

    }

    public class Month_ {

        @SerializedName("number")
        @Expose
        private Integer number;
        @SerializedName("en")
        @Expose
        private String en;

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

    }

    public class Offset {

        @SerializedName("Imsak")
        @Expose
        private Integer imsak;
        @SerializedName("Fajr")
        @Expose
        private Integer fajr;
        @SerializedName("Sunrise")
        @Expose
        private Integer sunrise;
        @SerializedName("Dhuhr")
        @Expose
        private Integer dhuhr;
        @SerializedName("Asr")
        @Expose
        private Integer asr;
        @SerializedName("Maghrib")
        @Expose
        private Integer maghrib;
        @SerializedName("Sunset")
        @Expose
        private Integer sunset;
        @SerializedName("Isha")
        @Expose
        private Integer isha;
        @SerializedName("Midnight")
        @Expose
        private Integer midnight;

        public Integer getImsak() {
            return imsak;
        }

        public void setImsak(Integer imsak) {
            this.imsak = imsak;
        }

        public Integer getFajr() {
            return fajr;
        }

        public void setFajr(Integer fajr) {
            this.fajr = fajr;
        }

        public Integer getSunrise() {
            return sunrise;
        }

        public void setSunrise(Integer sunrise) {
            this.sunrise = sunrise;
        }

        public Integer getDhuhr() {
            return dhuhr;
        }

        public void setDhuhr(Integer dhuhr) {
            this.dhuhr = dhuhr;
        }

        public Integer getAsr() {
            return asr;
        }

        public void setAsr(Integer asr) {
            this.asr = asr;
        }

        public Integer getMaghrib() {
            return maghrib;
        }

        public void setMaghrib(Integer maghrib) {
            this.maghrib = maghrib;
        }

        public Integer getSunset() {
            return sunset;
        }

        public void setSunset(Integer sunset) {
            this.sunset = sunset;
        }

        public Integer getIsha() {
            return isha;
        }

        public void setIsha(Integer isha) {
            this.isha = isha;
        }

        public Integer getMidnight() {
            return midnight;
        }

        public void setMidnight(Integer midnight) {
            this.midnight = midnight;
        }

    }

    public class Params {

        @SerializedName("Fajr")
        @Expose
        private Integer fajr;
        @SerializedName("Isha")
        @Expose
        private Integer isha;

        public Integer getFajr() {
            return fajr;
        }

        public void setFajr(Integer fajr) {
            this.fajr = fajr;
        }

        public Integer getIsha() {
            return isha;
        }

        public void setIsha(Integer isha) {
            this.isha = isha;
        }

    }

    public class Timings {

        @SerializedName("Fajr")
        @Expose
        private String fajr;
        @SerializedName("Sunrise")
        @Expose
        private String sunrise;
        @SerializedName("Dhuhr")
        @Expose
        private String dhuhr;
        @SerializedName("Asr")
        @Expose
        private String asr;
        @SerializedName("Sunset")
        @Expose
        private String sunset;
        @SerializedName("Maghrib")
        @Expose
        private String maghrib;
        @SerializedName("Isha")
        @Expose
        private String isha;
        @SerializedName("Imsak")
        @Expose
        private String imsak;
        @SerializedName("Midnight")
        @Expose
        private String midnight;

        public String getFajr() {
            return fajr;
        }

        public void setFajr(String fajr) {
            this.fajr = fajr;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getDhuhr() {
            return dhuhr;
        }

        public void setDhuhr(String dhuhr) {
            this.dhuhr = dhuhr;
        }

        public String getAsr() {
            return asr;
        }

        public void setAsr(String asr) {
            this.asr = asr;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getMaghrib() {
            return maghrib;
        }

        public void setMaghrib(String maghrib) {
            this.maghrib = maghrib;
        }

        public String getIsha() {
            return isha;
        }

        public void setIsha(String isha) {
            this.isha = isha;
        }

        public String getImsak() {
            return imsak;
        }

        public void setImsak(String imsak) {
            this.imsak = imsak;
        }

        public String getMidnight() {
            return midnight;
        }

        public void setMidnight(String midnight) {
            this.midnight = midnight;
        }

    }

    public class Weekday {

        @SerializedName("en")
        @Expose
        private String en;
        @SerializedName("ar")
        @Expose
        private String ar;

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getAr() {
            return ar;
        }

        public void setAr(String ar) {
            this.ar = ar;
        }

    }

    public class Weekday_ {

        @SerializedName("en")
        @Expose
        private String en;

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

    }


}


