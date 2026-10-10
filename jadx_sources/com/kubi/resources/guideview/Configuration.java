package com.kubi.resources.guideview;

import android.R;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.kubi.sdk.res.R$color;

/* JADX INFO: loaded from: classes11.dex */
class Configuration implements Parcelable {
    public static final Parcelable.Creator<Configuration> CREATOR = new C22891a();
    boolean mOutsideTouchable;
    View mTargetView = null;
    Rect mTargetRect = null;
    int mPadding = 0;
    int mPaddingLeft = 0;
    int mPaddingTop = 0;
    int mPaddingRight = 0;
    int mPaddingBottom = 0;
    int mAlpha = 255;
    int mFullingViewId = -1;
    int mTargetViewId = -1;
    int mCorner = 0;
    int mGraphStyle = -1;
    int mFullingColorId = R.color.black;
    boolean mAutoDismiss = true;
    boolean mOverlayTarget = false;
    boolean mShowCloseButton = false;
    int mEnterAnimationId = -1;
    int mExitAnimationId = -1;
    int mDashColor = R$color.primary;

    /* JADX INFO: renamed from: com.kubi.resources.guideview.Configuration$a */
    public class C22891a implements Parcelable.Creator<Configuration> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Configuration createFromParcel(Parcel parcel) {
            Configuration configuration = new Configuration();
            configuration.mAlpha = parcel.readInt();
            configuration.mFullingViewId = parcel.readInt();
            configuration.mTargetViewId = parcel.readInt();
            configuration.mFullingColorId = parcel.readInt();
            configuration.mCorner = parcel.readInt();
            configuration.mPadding = parcel.readInt();
            configuration.mPaddingLeft = parcel.readInt();
            configuration.mPaddingTop = parcel.readInt();
            configuration.mPaddingRight = parcel.readInt();
            configuration.mPaddingBottom = parcel.readInt();
            configuration.mGraphStyle = parcel.readInt();
            configuration.mAutoDismiss = parcel.readByte() == 1;
            configuration.mOverlayTarget = parcel.readByte() == 1;
            configuration.mDashColor = parcel.readInt();
            return configuration;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Configuration[] newArray(int i11) {
            return new Configuration[i11];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.mAlpha);
        parcel.writeInt(this.mFullingViewId);
        parcel.writeInt(this.mTargetViewId);
        parcel.writeInt(this.mFullingColorId);
        parcel.writeInt(this.mCorner);
        parcel.writeInt(this.mPadding);
        parcel.writeInt(this.mPaddingLeft);
        parcel.writeInt(this.mPaddingTop);
        parcel.writeInt(this.mPaddingRight);
        parcel.writeInt(this.mPaddingBottom);
        parcel.writeInt(this.mGraphStyle);
        parcel.writeByte(this.mAutoDismiss ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mOverlayTarget ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mDashColor);
    }
}
