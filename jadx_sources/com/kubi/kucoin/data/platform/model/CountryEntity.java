package com.kubi.kucoin.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blankj.utilcode.util.C5287o0;
import com.google.gson.annotations.SerializedName;
import com.kubi.app.country.R$string;
import com.kubi.kucoin.SceneCode;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CountryEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b:\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u00101\u001a\u00020\u0003J\u0006\u00102\u001a\u00020\tJ\u0006\u00103\u001a\u00020\u0003J\u0006\u00104\u001a\u00020\tJ\u0006\u00105\u001a\u00020\tJ\u0006\u00106\u001a\u00020\tJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u0082\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010CJ\u0006\u0010D\u001a\u00020\fJ\u0013\u0010E\u001a\u00020\t2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\fHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015¨\u0006O"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "Landroid/os/Parcelable;", "code", "", TUIThemeManager.LANGUAGE_EN, "cn", "mobileCode", "ico", "dismissBreak", "", "voiceAllowed", "weight", "", "dismiss", "dismissLogin", "sceneCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZIZZLjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getEn", "setEn", "getCn", "setCn", "getMobileCode", "setMobileCode", "getIco", "setIco", "getDismissBreak", "()Ljava/lang/Boolean;", "setDismissBreak", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getVoiceAllowed", "()Z", "setVoiceAllowed", "(Z)V", "getWeight", "()I", "setWeight", "(I)V", "getDismiss", "setDismiss", "getDismissLogin", "setDismissLogin", "getSceneCode", "setSceneCode", "text", "isOther", "getDisplayMobileCode", "isDismissed", "isSupportRegister", "isSupportLogin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZIZZLjava/lang/String;)Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCountryEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryEntity.kt\ncom/kubi/kucoin/data/platform/model/CountryEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final /* data */ class CountryEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CountryEntity> CREATOR = new C15315a();

    @Nullable
    private String cn;

    @NotNull
    private String code;
    private boolean dismiss;

    @SerializedName("dismissBreak")
    @Nullable
    private Boolean dismissBreak;
    private boolean dismissLogin;

    @NotNull
    private String en;

    @Nullable
    private String ico;

    @SerializedName("mobileCode")
    @NotNull
    private String mobileCode;

    @NotNull
    private String sceneCode;

    @SerializedName("supportVoice")
    private boolean voiceAllowed;

    @SerializedName("weight")
    private int weight;

    /* JADX INFO: renamed from: com.kubi.kucoin.data.platform.model.CountryEntity$a */
    /* JADX INFO: compiled from: CountryEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15315a implements Parcelable.Creator<CountryEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CountryEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z13 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                z13 = false;
            }
            int i11 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z11 = true;
                z12 = true;
            } else {
                z11 = z13;
                z12 = false;
            }
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            return new CountryEntity(string, string2, string3, string4, string5, boolValueOf, z13, i11, z12, z11, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CountryEntity[] newArray(int i11) {
            return new CountryEntity[i11];
        }
    }

    public CountryEntity() {
        this(null, null, null, null, null, null, false, 0, false, false, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryEntity)) {
            return false;
        }
        CountryEntity countryEntity = (CountryEntity) other;
        return Intrinsics.areEqual(this.code, countryEntity.code) && Intrinsics.areEqual(this.en, countryEntity.en) && Intrinsics.areEqual(this.cn, countryEntity.cn) && Intrinsics.areEqual(this.mobileCode, countryEntity.mobileCode) && Intrinsics.areEqual(this.ico, countryEntity.ico) && Intrinsics.areEqual(this.dismissBreak, countryEntity.dismissBreak) && this.voiceAllowed == countryEntity.voiceAllowed && this.weight == countryEntity.weight && this.dismiss == countryEntity.dismiss && this.dismissLogin == countryEntity.dismissLogin && Intrinsics.areEqual(this.sceneCode, countryEntity.sceneCode);
    }

    public CountryEntity(@NotNull String code, @NotNull String en2, @Nullable String str, @NotNull String mobileCode, @Nullable String str2, @Nullable Boolean bool, boolean z11, int i11, boolean z12, boolean z13, @NotNull String sceneCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(en2, "en");
        Intrinsics.checkNotNullParameter(mobileCode, "mobileCode");
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        this.code = code;
        this.en = en2;
        this.cn = str;
        this.mobileCode = mobileCode;
        this.ico = str2;
        this.dismissBreak = bool;
        this.voiceAllowed = z11;
        this.weight = i11;
        this.dismiss = z12;
        this.dismissLogin = z13;
        this.sceneCode = sceneCode;
    }

    public static /* synthetic */ CountryEntity copy$default(CountryEntity countryEntity, String str, String str2, String str3, String str4, String str5, Boolean bool, boolean z11, int i11, boolean z12, boolean z13, String str6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = countryEntity.code;
        }
        if ((i12 & 2) != 0) {
            str2 = countryEntity.en;
        }
        if ((i12 & 4) != 0) {
            str3 = countryEntity.cn;
        }
        if ((i12 & 8) != 0) {
            str4 = countryEntity.mobileCode;
        }
        if ((i12 & 16) != 0) {
            str5 = countryEntity.ico;
        }
        if ((i12 & 32) != 0) {
            bool = countryEntity.dismissBreak;
        }
        if ((i12 & 64) != 0) {
            z11 = countryEntity.voiceAllowed;
        }
        if ((i12 & 128) != 0) {
            i11 = countryEntity.weight;
        }
        if ((i12 & 256) != 0) {
            z12 = countryEntity.dismiss;
        }
        if ((i12 & 512) != 0) {
            z13 = countryEntity.dismissLogin;
        }
        if ((i12 & 1024) != 0) {
            str6 = countryEntity.sceneCode;
        }
        boolean z14 = z13;
        String str7 = str6;
        int i13 = i11;
        boolean z15 = z12;
        Boolean bool2 = bool;
        boolean z16 = z11;
        String str8 = str5;
        String str9 = str3;
        return countryEntity.copy(str, str2, str9, str4, str8, bool2, z16, i13, z15, z14, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getDismissLogin() {
        return this.dismissLogin;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSceneCode() {
        return this.sceneCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEn() {
        return this.en;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCn() {
        return this.cn;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobileCode() {
        return this.mobileCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIco() {
        return this.ico;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getDismissBreak() {
        return this.dismissBreak;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getVoiceAllowed() {
        return this.voiceAllowed;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getDismiss() {
        return this.dismiss;
    }

    @NotNull
    public final CountryEntity copy(@NotNull String code, @NotNull String en2, @Nullable String cn2, @NotNull String mobileCode, @Nullable String ico, @Nullable Boolean dismissBreak, boolean voiceAllowed, int weight, boolean dismiss, boolean dismissLogin, @NotNull String sceneCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(en2, "en");
        Intrinsics.checkNotNullParameter(mobileCode, "mobileCode");
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        return new CountryEntity(code, en2, cn2, mobileCode, ico, dismissBreak, voiceAllowed, weight, dismiss, dismissLogin, sceneCode);
    }

    @Nullable
    public final String getCn() {
        return this.cn;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final boolean getDismiss() {
        return this.dismiss;
    }

    @Nullable
    public final Boolean getDismissBreak() {
        return this.dismissBreak;
    }

    public final boolean getDismissLogin() {
        return this.dismissLogin;
    }

    @NotNull
    public final String getDisplayMobileCode() {
        if (!Intrinsics.areEqual("+86", this.mobileCode)) {
            return this.mobileCode;
        }
        String string = C5287o0.m6331a().getString(R$string.other);
        Intrinsics.checkNotNull(string);
        return string;
    }

    @NotNull
    public final String getEn() {
        return this.en;
    }

    @Nullable
    public final String getIco() {
        return this.ico;
    }

    @NotNull
    public final String getMobileCode() {
        return this.mobileCode;
    }

    @NotNull
    public final String getSceneCode() {
        return this.sceneCode;
    }

    public final boolean getVoiceAllowed() {
        return this.voiceAllowed;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + this.en.hashCode()) * 31;
        String str = this.cn;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mobileCode.hashCode()) * 31;
        String str2 = this.ico;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.dismissBreak;
        return ((((((((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.voiceAllowed)) * 31) + Integer.hashCode(this.weight)) * 31) + Boolean.hashCode(this.dismiss)) * 31) + Boolean.hashCode(this.dismissLogin)) * 31) + this.sceneCode.hashCode();
    }

    public final boolean isDismissed() {
        Boolean bool = this.dismissBreak;
        if (bool != null) {
            return bool.booleanValue();
        }
        return Intrinsics.areEqual(this.sceneCode, SceneCode.PHONE_LOGIN_COUNTRY_CODE.toString()) ? this.dismissLogin : this.dismiss;
    }

    public final boolean isOther() {
        return Intrinsics.areEqual("OT", this.code);
    }

    public final void setCn(@Nullable String str) {
        this.cn = str;
    }

    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setDismiss(boolean z11) {
        this.dismiss = z11;
    }

    public final void setDismissBreak(@Nullable Boolean bool) {
        this.dismissBreak = bool;
    }

    public final void setDismissLogin(boolean z11) {
        this.dismissLogin = z11;
    }

    public final void setEn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.en = str;
    }

    public final void setIco(@Nullable String str) {
        this.ico = str;
    }

    public final void setMobileCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileCode = str;
    }

    public final void setSceneCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sceneCode = str;
    }

    public final void setVoiceAllowed(boolean z11) {
        this.voiceAllowed = z11;
    }

    public final void setWeight(int i11) {
        this.weight = i11;
    }

    @NotNull
    public String toString() {
        return "CountryEntity(code=" + this.code + ", en=" + this.en + ", cn=" + this.cn + ", mobileCode=" + this.mobileCode + ", ico=" + this.ico + ", dismissBreak=" + this.dismissBreak + ", voiceAllowed=" + this.voiceAllowed + ", weight=" + this.weight + ", dismiss=" + this.dismiss + ", dismissLogin=" + this.dismissLogin + ", sceneCode=" + this.sceneCode + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.en);
        dest.writeString(this.cn);
        dest.writeString(this.mobileCode);
        dest.writeString(this.ico);
        Boolean bool = this.dismissBreak;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeInt(this.voiceAllowed ? 1 : 0);
        dest.writeInt(this.weight);
        dest.writeInt(this.dismiss ? 1 : 0);
        dest.writeInt(this.dismissLogin ? 1 : 0);
        dest.writeString(this.sceneCode);
    }

    public final boolean isSupportLogin() {
        return !isDismissed();
    }

    public final boolean isSupportRegister() {
        return !isDismissed();
    }

    @NotNull
    public final String text() {
        if (MultiLanguageManager.m56979h()) {
            String str = this.cn;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                return "";
            }
            return str;
        }
        return this.en;
    }

    public /* synthetic */ CountryEntity(String str, String str2, String str3, String str4, String str5, Boolean bool, boolean z11, int i11, boolean z12, boolean z13, String str6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? "" : str4, (i12 & 16) != 0 ? "" : str5, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? 0 : i11, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? "" : str6);
    }
}
