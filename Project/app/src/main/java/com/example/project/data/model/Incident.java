package com.example.project.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;

import java.util.Objects;

@Entity(primaryKeys = {"report_id", "num"})
public abstract class Incident implements Parcelable {
    @NonNull
    @ColumnInfo(name = "report_id")
    public String reportId = "noIdYet!";
    public int num;
    @Embedded
    public Info info;

    public Incident () {
    }

    protected Incident(Parcel in) {
        reportId = Objects.requireNonNull(in.readString());
        num = in.readInt();
        info = in.readParcelable(Info.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(reportId);
        dest.writeInt(num);
        dest.writeParcelable(info, flags);
    }

    public void setReportId(String reportId) {
        if(this.reportId.equals("noIdYet!")) this.reportId = reportId;
    }

    public void setInfo(Info info) {
        if(this.info == null) this.info = info;
    }

    public String getReportId() {
        return reportId;
    }

    public int getNum() {
        return num;
    }

    public Info getInfo() {
        return info;
    }
}
