package com.sumsub.sns.core.data.listener;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import com.kubi.otc.entity.FastQuoteModel;
import com.sensorsdata.abtest.entity.AppConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rJ\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000e"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "", "onResolveIcon", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "key", "", "SNSResultIcons", "SNSEidIcons", "SNSCommonIcons", "SNSRestrictionsIcons", "SNSPaymentMethodIcons", "SNSIdentityTypeIcons", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface SNSIconHandler {

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2¨\u00063"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;", "", "imageName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getImageName", "()Ljava/lang/String;", "CLOSE", "DISCLOSURE", "DROPDOWN", "TORCH_ON", "TORCH_OFF", "GALLERY", "INFO", "WARNING", "NOTIFY", "MAIL", "BACK", "BIN", "CALENDAR", "ATTACHMENT", "IMAGE", "SEARCH", "WARNING_OUTLINE", "TAKE_PHOTO", "LOCATION_ON", "LOCATION_OFF", "COUNTRY_OTHER", "PICTURE_AGREEMENT", "ICON_ID", "ICON_HOME", "ICON_PERSONS", "ICON_LIGHT", "ICON_CAMERA", "ICON_WIFI", "ROTATE_CW", "ROTATE_CCW", "FLIP", "SUCCESS_CHECK", "ICON_LAUNCH", "ICON_WORDLESS_FAILURE", "INSTANT_ACTION", "LOCK", "SUCCESS_FILLED", "FAILURE_FILLED", "ICON_PERSON", "GALLERY_SMALL", "ADD", "DELETE", "MORE", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum SNSCommonIcons {
        CLOSE("iconClose"),
        DISCLOSURE("iconDisclosure"),
        DROPDOWN("iconDropdown"),
        TORCH_ON("iconTorchOn"),
        TORCH_OFF("iconTorchOff"),
        GALLERY("iconGallery"),
        INFO("iconInfo"),
        WARNING("iconWarning"),
        NOTIFY("iconNotify"),
        MAIL("iconMail"),
        BACK("iconBack"),
        BIN("iconBin"),
        CALENDAR("iconCalendar"),
        ATTACHMENT("iconAttachment"),
        IMAGE("iconImage"),
        SEARCH("iconSearch"),
        WARNING_OUTLINE("pictureWarningOutline"),
        TAKE_PHOTO("iconTakePhoto"),
        LOCATION_ON("pictureGeolocationOn"),
        LOCATION_OFF("pictureGeolocationOff"),
        COUNTRY_OTHER("iconOtherCountry"),
        PICTURE_AGREEMENT("pictureAgreement"),
        ICON_ID("iconID"),
        ICON_HOME("iconHouse"),
        ICON_PERSONS("iconPersons"),
        ICON_LIGHT("iconLight"),
        ICON_CAMERA("iconCamera"),
        ICON_WIFI("iconWifi"),
        ROTATE_CW("iconRotateCW"),
        ROTATE_CCW("iconRotateCCW"),
        FLIP("pictureDocumentFlip"),
        SUCCESS_CHECK("iconSuccess"),
        ICON_LAUNCH("iconLaunch"),
        ICON_WORDLESS_FAILURE("pictureWordlessFatalFailure"),
        INSTANT_ACTION("iconInstantAction"),
        LOCK("iconLock"),
        SUCCESS_FILLED("iconSuccessFilled"),
        FAILURE_FILLED("iconFailureFilled"),
        ICON_PERSON("iconPerson"),
        GALLERY_SMALL("iconGallerySmall"),
        ADD("iconAdd"),
        DELETE("iconDelete"),
        MORE("iconMore");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        private final String imageName;

        @NotNull
        public static EnumEntries<SNSCommonIcons> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getImageName() {
            return this.imageName;
        }

        SNSCommonIcons(String str) {
            this.imageName = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;", "", "imageName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getImageName", "()Ljava/lang/String;", "DONE", "ID_CARD", "PIN", "CAN", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum SNSEidIcons {
        DONE("pictureEidDone"),
        ID_CARD("pictureEidCard"),
        PIN("pictureEidPinCode"),
        CAN("pictureEidCanCode");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        private final String imageName;

        @NotNull
        public static EnumEntries<SNSEidIcons> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getImageName() {
            return this.imageName;
        }

        SNSEidIcons(String str) {
            this.imageName = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;", "", "imageName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getImageName", "()Ljava/lang/String;", "PASSPORT", "DRIVERS", "RESIDENCE_PERMIT", "ID_CARD", "VISA", "SNILS", "INSURANCE_CERTIFICATE", "SELFIE", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum SNSIdentityTypeIcons {
        PASSPORT("PASSPORT"),
        DRIVERS("DRIVERS"),
        RESIDENCE_PERMIT("RESIDENCE_PERMIT"),
        ID_CARD("ID_CARD"),
        VISA("VISA"),
        SNILS("SNILS"),
        INSURANCE_CERTIFICATE("INSURANCE_CERTIFICATE"),
        SELFIE("SELFIE");


        @NotNull
        public static final String IDENTITY_TYPE_PREFIX = "IdentityType/";

        @NotNull
        private final String imageName;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons$Companion;", "", "<init>", "()V", "IDENTITY_TYPE_PREFIX", "", "imageKey", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @NotNull
            public final String imageKey(@NotNull SNSIdentityTypeIcons sNSIdentityTypeIcons) {
                return SNSIdentityTypeIcons.IDENTITY_TYPE_PREFIX + sNSIdentityTypeIcons.getImageName();
            }
        }

        @NotNull
        public static EnumEntries<SNSIdentityTypeIcons> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getImageName() {
            return this.imageName;
        }

        SNSIdentityTypeIcons(String str) {
            this.imageName = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSPaymentMethodIcons;", "", "imageName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getImageName", "()Ljava/lang/String;", FastQuoteModel.PAY_BANK_CARD, "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum SNSPaymentMethodIcons {
        BANK_CARD("PaymentMethod/BankCard");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        private final String imageName;

        @NotNull
        public static EnumEntries<SNSPaymentMethodIcons> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getImageName() {
            return this.imageName;
        }

        SNSPaymentMethodIcons(String str) {
            this.imageName = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;", "", "imageName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getImageName", "()Ljava/lang/String;", "VPN", "DEFAULT", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum SNSRestrictionsIcons {
        VPN("pictureRestrictionVpn"),
        DEFAULT("pictureRestrictionDefault");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        private final String imageName;

        @NotNull
        public static EnumEntries<SNSRestrictionsIcons> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getImageName() {
            return this.imageName;
        }

        SNSRestrictionsIcons(String str) {
            this.imageName = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;", "", "imageName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getImageName", "()Ljava/lang/String;", AppConstants.AB_TEST_SUCCESS, "FAILURE", "SUBMITTED", "WARNING", "INFO", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum SNSResultIcons {
        SUCCESS("pictureSuccess"),
        FAILURE("pictureFailure"),
        SUBMITTED("pictureSubmitted"),
        WARNING("pictureWarning"),
        INFO("pictureInfo");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        private final String imageName;

        @NotNull
        public static EnumEntries<SNSResultIcons> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getImageName() {
            return this.imageName;
        }

        SNSResultIcons(String str) {
            this.imageName = str;
        }
    }

    @Nullable
    Drawable onResolveIcon(@NotNull Context context, @NotNull String key);
}
