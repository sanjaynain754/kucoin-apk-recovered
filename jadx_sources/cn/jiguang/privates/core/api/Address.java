package cn.jiguang.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class Address implements Parcelable {
    public static final Parcelable.Creator<Address> CREATOR = new Parcelable.Creator<Address>() { // from class: cn.jiguang.privates.core.api.Address.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Address createFromParcel(Parcel parcel) {
            return new Address(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Address[] newArray(int i11) {
            return new Address[i11];
        }
    };
    private String defaultHost;
    private String defaultIp;
    private int defaultPort;
    private String defaultReportUrl;
    private String[] sisHostArray;
    private String[] sisIpArray;
    private int sisPort;

    public Address() {
        this.sisHostArray = null;
        this.sisIpArray = null;
        this.sisPort = 0;
        this.defaultHost = "";
        this.defaultIp = "";
        this.defaultPort = 0;
        this.defaultReportUrl = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDefaultHost() {
        return this.defaultHost;
    }

    public String getDefaultIp() {
        return this.defaultIp;
    }

    public int getDefaultPort() {
        return this.defaultPort;
    }

    public String getDefaultReportUrl() {
        return this.defaultReportUrl;
    }

    public String[] getSisHostArray() {
        return this.sisHostArray;
    }

    public String[] getSisIpArray() {
        return this.sisIpArray;
    }

    public int getSisPort() {
        return this.sisPort;
    }

    public Address setDefaultHost(String str) {
        this.defaultHost = str;
        return this;
    }

    public Address setDefaultIp(String str) {
        this.defaultIp = str;
        return this;
    }

    public Address setDefaultPort(int i11) {
        this.defaultPort = i11;
        return this;
    }

    public Address setDefaultReportUrl(String str) {
        this.defaultReportUrl = str;
        return this;
    }

    public Address setSisHostArray(String... strArr) {
        this.sisHostArray = strArr;
        return this;
    }

    public Address setSisIpArray(String... strArr) {
        this.sisIpArray = strArr;
        return this;
    }

    public Address setSisPort(int i11) {
        this.sisPort = i11;
        return this;
    }

    public String toString() {
        return "\n{\n  sisHostArray=" + this.sisHostArray + ",\n  sisIpArray=" + this.sisIpArray + ",\n  sisPort=" + this.sisPort + ",\n  defaultHost=" + this.defaultHost + ",\n  defaultIp=" + this.defaultIp + ",\n  defaultHost=" + this.defaultHost + ",\n  defaultPort=" + this.defaultPort + ",\n  defaultReportUrl=" + this.defaultReportUrl + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringArray(this.sisHostArray);
        parcel.writeStringArray(this.sisIpArray);
        parcel.writeInt(this.sisPort);
        parcel.writeString(this.defaultHost);
        parcel.writeString(this.defaultIp);
        parcel.writeInt(this.defaultPort);
        parcel.writeString(this.defaultReportUrl);
    }

    public Address(Parcel parcel) {
        this.sisHostArray = null;
        this.sisIpArray = null;
        this.sisPort = 0;
        this.defaultHost = "";
        this.defaultIp = "";
        this.defaultPort = 0;
        this.defaultReportUrl = "";
        this.sisHostArray = parcel.createStringArray();
        this.sisIpArray = parcel.createStringArray();
        this.sisPort = parcel.readInt();
        this.defaultHost = parcel.readString();
        this.defaultIp = parcel.readString();
        this.defaultPort = parcel.readInt();
        this.defaultReportUrl = parcel.readString();
    }
}
