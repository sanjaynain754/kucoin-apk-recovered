package cn.jiguang.privates.analysis.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class Config implements Parcelable {
    public static final Parcelable.Creator<Config> CREATOR = new Parcelable.Creator<Config>() { // from class: cn.jiguang.privates.analysis.api.Config.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Config createFromParcel(Parcel parcel) {
            return new Config(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Config[] newArray(int i11) {
            return new Config[i11];
        }
    };
    public static final int NETWORK_TYPE_ALL = 0;
    public static final int NETWORK_TYPE_MOBILE = 2;
    public static final int NETWORK_TYPE_WIFI = 1;
    private int reportNetworkState;
    private boolean reportTestState;

    public Config() {
        this.reportNetworkState = 0;
        this.reportTestState = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getReportNetworkState() {
        return this.reportNetworkState;
    }

    @Deprecated
    public int getReportNetworkType() {
        return this.reportNetworkState;
    }

    public boolean getReportTestState() {
        return this.reportTestState;
    }

    @Deprecated
    public boolean getTestReportEnable() {
        return this.reportTestState;
    }

    public Config setReportNetworkState(int i11) {
        this.reportNetworkState = i11;
        return this;
    }

    @Deprecated
    public Config setReportNetworkType(int i11) {
        if (i11 >= 0 && i11 <= 2) {
            this.reportNetworkState = i11;
        }
        return this;
    }

    public Config setReportTestState(boolean z11) {
        this.reportTestState = z11;
        return this;
    }

    @Deprecated
    public Config setTestReportEnable(boolean z11) {
        this.reportTestState = z11;
        return this;
    }

    public String toString() {
        return "\n{\n  reportNetworkState='" + this.reportNetworkState + ",\n  reportTestState=" + this.reportTestState + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.reportNetworkState);
        parcel.writeByte(this.reportTestState ? (byte) 1 : (byte) 0);
    }

    public Config(Parcel parcel) {
        this.reportNetworkState = 0;
        this.reportTestState = false;
        this.reportNetworkState = parcel.readInt();
        this.reportTestState = parcel.readByte() != 0;
    }
}
