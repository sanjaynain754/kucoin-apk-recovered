package ai.advance.sdk.global.iqa.lib;

import ai.advance.sdk.global.iqa.lib.data.CropParams;
import ai.advance.sdk.global.iqa.lib.enums.CardSide;
import ai.advance.sdk.global.iqa.lib.enums.CardType;
import ai.advance.sdk.global.iqa.lib.enums.Mode;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Random;
import java.util.UUID;
import p387k.C40828c;

/* JADX INFO: loaded from: classes23.dex */
public class IQAPageState implements Parcelable {
    public static final Parcelable.Creator<IQAPageState> CREATOR = new C0354a();
    private int cameraAngle;
    public CropParams cropParams;
    private Mode givenMode;
    private CardSide inputCardSide;
    private CardType inputCardType;
    private int mCameraId;
    private boolean mCameraIdInitialized;
    public IQAExtras mIqaExtras;
    public boolean mSoundPlayEnable;
    private int maxRetryTimes;
    private String pageId;
    private String region;
    private int remainingRetryTimes;
    private boolean returnEmpty;
    private Integer screenOrientation;
    private String screenOrientationRotateHistory;
    private int takePhotoTipDialogShowingSeconds;
    private int timeoutSeconds;
    private String transactionId;
    public UIExtras uiExtras;

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.IQAPageState$a */
    public class C0354a implements Parcelable.Creator<IQAPageState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IQAPageState createFromParcel(Parcel parcel) {
            return new IQAPageState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IQAPageState[] newArray(int i11) {
            return new IQAPageState[i11];
        }
    }

    public IQAPageState() {
        this.mCameraId = -1;
        this.mCameraIdInitialized = false;
        this.transactionId = UUID.randomUUID().toString() + C33820nf.f71144W + new Random().nextInt(100);
        this.screenOrientationRotateHistory = "";
        this.inputCardSide = CardSide.FRONT;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IQAPageState(Parcel parcel) {
        this.mCameraId = -1;
        this.mCameraIdInitialized = false;
        this.remainingRetryTimes = parcel.readInt();
        this.maxRetryTimes = parcel.readInt();
        this.returnEmpty = parcel.readByte() != 0;
        this.transactionId = parcel.readString();
        int i11 = parcel.readInt();
        this.inputCardSide = i11 == -1 ? null : CardSide.values()[i11];
        int i12 = parcel.readInt();
        this.inputCardType = i12 == -1 ? null : CardType.values()[i12];
        this.takePhotoTipDialogShowingSeconds = parcel.readInt();
        this.pageId = parcel.readString();
        this.region = parcel.readString();
        this.screenOrientation = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.screenOrientationRotateHistory = parcel.readString();
        this.timeoutSeconds = parcel.readInt();
        this.cameraAngle = parcel.readInt();
        int i13 = parcel.readInt();
        this.givenMode = i13 != -1 ? Mode.values()[i13] : null;
        this.cropParams = (CropParams) parcel.readParcelable(CropParams.class.getClassLoader());
        this.mSoundPlayEnable = parcel.readByte() != 0;
        this.uiExtras = (UIExtras) parcel.readSerializable();
        this.mIqaExtras = (IQAExtras) parcel.readSerializable();
        this.mCameraId = parcel.readInt();
        this.mCameraIdInitialized = true;
    }

    public boolean canRetry() {
        return this.remainingRetryTimes > 0;
    }

    public void costOneTime() {
        this.remainingRetryTimes--;
    }

    public int getCameraAngle() {
        return this.cameraAngle;
    }

    public int getCameraId() {
        if (!this.mCameraIdInitialized) {
            this.mCameraId = C40828c.m89330d();
            this.mCameraIdInitialized = true;
        }
        return this.mCameraId;
    }

    public Mode getGivenMode() {
        Mode mode = this.givenMode;
        return mode == null ? Mode.DEFAULT : mode;
    }

    public CardSide getInputCardSide() {
        return this.inputCardSide;
    }

    public CardType getInputCardType() {
        return this.inputCardType;
    }

    public int getMaxRetryTimes() {
        return Math.max(this.maxRetryTimes, 0);
    }

    public String getPageId() {
        return this.pageId;
    }

    public String getRegion() {
        return this.region;
    }

    public int getRemainingRetryTimes() {
        return this.remainingRetryTimes;
    }

    public int getScreenOrientation() {
        return this.screenOrientation.intValue();
    }

    public String getScreenOrientationRotateHistory() {
        return this.screenOrientationRotateHistory;
    }

    public int getTakePhotoTipDialogShowingSeconds() {
        return this.takePhotoTipDialogShowingSeconds;
    }

    public int getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public boolean isFrontCardSide() {
        return CardSide.FRONT == this.inputCardSide;
    }

    public boolean isReturnEmpty() {
        return this.returnEmpty;
    }

    public void setCameraAngle(int i11) {
        this.cameraAngle = i11;
    }

    public void setCameraId(int i11) {
        this.mCameraId = i11;
        this.mCameraIdInitialized = true;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }

    public void setUIExtras(UIExtras uIExtras) {
        this.uiExtras = uIExtras;
        this.timeoutSeconds = uIExtras.getScanLimitSeconds().intValue();
        this.takePhotoTipDialogShowingSeconds = uIExtras.getTakePhotoTipDialogShowSeconds().intValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.remainingRetryTimes);
        parcel.writeInt(this.maxRetryTimes);
        parcel.writeByte(this.returnEmpty ? (byte) 1 : (byte) 0);
        parcel.writeString(this.transactionId);
        CardSide cardSide = this.inputCardSide;
        parcel.writeInt(cardSide == null ? -1 : cardSide.ordinal());
        CardType cardType = this.inputCardType;
        parcel.writeInt(cardType == null ? -1 : cardType.ordinal());
        parcel.writeInt(this.takePhotoTipDialogShowingSeconds);
        parcel.writeString(this.pageId);
        parcel.writeString(this.region);
        parcel.writeValue(this.screenOrientation);
        parcel.writeString(this.screenOrientationRotateHistory);
        parcel.writeInt(this.timeoutSeconds);
        parcel.writeInt(this.cameraAngle);
        Mode mode = this.givenMode;
        parcel.writeInt(mode != null ? mode.ordinal() : -1);
        parcel.writeParcelable(this.cropParams, i11);
        parcel.writeByte(this.mSoundPlayEnable ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.uiExtras);
        parcel.writeSerializable(this.mIqaExtras);
        parcel.writeInt(this.mCameraId);
    }

    public boolean isFrontCamera() {
        if (getCameraId() == C40828c.m89332f()) {
            return true;
        }
        return false;
    }

    public boolean isPortrait() {
        if (getScreenOrientation() == 1) {
            return true;
        }
        return false;
    }

    public boolean isScanMode() {
        return canRetry();
    }

    public void readFromParcel(Parcel parcel) {
        boolean z11;
        CardSide cardSide;
        CardType cardType;
        this.remainingRetryTimes = parcel.readInt();
        this.maxRetryTimes = parcel.readInt();
        boolean z12 = false;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.returnEmpty = z11;
        this.transactionId = parcel.readString();
        int i11 = parcel.readInt();
        Mode mode = null;
        if (i11 == -1) {
            cardSide = null;
        } else {
            cardSide = CardSide.values()[i11];
        }
        this.inputCardSide = cardSide;
        int i12 = parcel.readInt();
        if (i12 == -1) {
            cardType = null;
        } else {
            cardType = CardType.values()[i12];
        }
        this.inputCardType = cardType;
        this.takePhotoTipDialogShowingSeconds = parcel.readInt();
        this.pageId = parcel.readString();
        this.region = parcel.readString();
        this.screenOrientation = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.screenOrientationRotateHistory = parcel.readString();
        this.timeoutSeconds = parcel.readInt();
        this.cameraAngle = parcel.readInt();
        int i13 = parcel.readInt();
        if (i13 != -1) {
            mode = Mode.values()[i13];
        }
        this.givenMode = mode;
        this.cropParams = (CropParams) parcel.readParcelable(CropParams.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z12 = true;
        }
        this.mSoundPlayEnable = z12;
        this.uiExtras = (UIExtras) parcel.readSerializable();
        this.mIqaExtras = (IQAExtras) parcel.readSerializable();
        this.mCameraId = parcel.readInt();
        this.mCameraIdInitialized = true;
    }

    public void setIQAExtras(IQAExtras iQAExtras) {
        this.inputCardType = iQAExtras.getCardType();
        this.inputCardSide = iQAExtras.getCardSide();
        this.givenMode = iQAExtras.getMode();
        this.mSoundPlayEnable = iQAExtras.isSoundPlayEnable();
        this.maxRetryTimes = iQAExtras.getMaxRetryTimes();
        if (this.givenMode == Mode.TAKE_PHOTO) {
            this.maxRetryTimes = 0;
        }
        this.remainingRetryTimes = this.maxRetryTimes;
        this.region = iQAExtras.getRegion();
        this.returnEmpty = iQAExtras.isReturnEmpty();
        this.mIqaExtras = iQAExtras;
        if (this.uiExtras == null) {
            this.timeoutSeconds = 20;
            this.takePhotoTipDialogShowingSeconds = 0;
        }
    }

    public void setScreenOrientation(int i11) {
        this.screenOrientation = Integer.valueOf(i11);
        this.screenOrientationRotateHistory += i11;
    }
}
