package cn.jiguang.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class NotificationLayout implements Parcelable {
    public static final Parcelable.Creator<NotificationLayout> CREATOR = new Parcelable.Creator<NotificationLayout>() { // from class: cn.jiguang.privates.push.api.NotificationLayout.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationLayout createFromParcel(Parcel parcel) {
            return new NotificationLayout(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationLayout[] newArray(int i11) {
            return new NotificationLayout[i11];
        }
    };
    private int contentViewId;
    private int iconResourceId;
    private int iconViewId;
    private int layoutId;
    private int timeViewId;
    private int titleViewId;

    public NotificationLayout() {
        this.layoutId = 0;
        this.iconViewId = 0;
        this.iconResourceId = 0;
        this.titleViewId = 0;
        this.contentViewId = 0;
        this.timeViewId = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getContentViewId() {
        return this.contentViewId;
    }

    public int getIconResourceId() {
        return this.iconResourceId;
    }

    public int getIconViewId() {
        return this.iconViewId;
    }

    public int getLayoutId() {
        return this.layoutId;
    }

    public int getTimeViewId() {
        return this.timeViewId;
    }

    public int getTitleViewId() {
        return this.titleViewId;
    }

    public NotificationLayout setContentViewId(int i11) {
        this.contentViewId = i11;
        return this;
    }

    public NotificationLayout setIconResourceId(int i11) {
        this.iconResourceId = i11;
        return this;
    }

    public NotificationLayout setIconViewId(int i11) {
        this.iconViewId = i11;
        return this;
    }

    public NotificationLayout setLayoutId(int i11) {
        this.layoutId = i11;
        return this;
    }

    public NotificationLayout setTimeViewId(int i11) {
        this.timeViewId = i11;
        return this;
    }

    public NotificationLayout setTitleViewId(int i11) {
        this.titleViewId = i11;
        return this;
    }

    public String toString() {
        return "\n{\n  layoutId=" + this.layoutId + ",\n  iconViewId=" + this.iconViewId + ",\n  titleViewId=" + this.titleViewId + ",\n  contentViewId=" + this.contentViewId + ",\n  timeViewId=" + this.timeViewId + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.layoutId);
        parcel.writeInt(this.iconViewId);
        parcel.writeInt(this.iconResourceId);
        parcel.writeInt(this.titleViewId);
        parcel.writeInt(this.contentViewId);
        parcel.writeInt(this.timeViewId);
    }

    public NotificationLayout(Parcel parcel) {
        this.layoutId = 0;
        this.iconViewId = 0;
        this.iconResourceId = 0;
        this.titleViewId = 0;
        this.contentViewId = 0;
        this.timeViewId = 0;
        this.layoutId = parcel.readInt();
        this.iconViewId = parcel.readInt();
        this.iconResourceId = parcel.readInt();
        this.titleViewId = parcel.readInt();
        this.contentViewId = parcel.readInt();
        this.timeViewId = parcel.readInt();
    }
}
