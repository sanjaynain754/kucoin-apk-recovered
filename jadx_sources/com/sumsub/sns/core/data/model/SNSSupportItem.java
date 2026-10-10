package com.sumsub.sns.core.data.model;

import android.graphics.drawable.Drawable;
import android.util.Patterns;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.sumsub.sentry.AbstractC27897U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Je\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "", "title", "", "subtitle", "type", "Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;", "value", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "iconName", "onClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getType", "()Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;", "getValue", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "getIconName", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "isValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class SNSSupportItem {

    @Nullable
    private final Drawable iconDrawable;

    @Nullable
    private final String iconName;

    @Nullable
    private final Function1<SNSSupportItem, Unit> onClick;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;

    @NotNull
    private final Type type;

    @NotNull
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Url", "Email", TypedValues.Custom.NAME, "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum Type {
        Url,
        Email,
        Custom;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SNSSupportItem(@Nullable String str, @Nullable String str2, @NotNull Type type, @NotNull String str3, @Nullable Drawable drawable, @Nullable String str4, @Nullable Function1<? super SNSSupportItem, Unit> function1) {
        this.title = str;
        this.subtitle = str2;
        this.type = type;
        this.value = str3;
        this.iconDrawable = drawable;
        this.iconName = str4;
        this.onClick = function1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSSupportItem)) {
            return false;
        }
        SNSSupportItem sNSSupportItem = (SNSSupportItem) other;
        return Intrinsics.areEqual(this.title, sNSSupportItem.title) && Intrinsics.areEqual(this.subtitle, sNSSupportItem.subtitle) && this.type == sNSSupportItem.type && Intrinsics.areEqual(this.value, sNSSupportItem.value) && Intrinsics.areEqual(this.iconDrawable, sNSSupportItem.iconDrawable) && Intrinsics.areEqual(this.iconName, sNSSupportItem.iconName) && Intrinsics.areEqual(this.onClick, sNSSupportItem.onClick);
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Url.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Email.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SNSSupportItem copy$default(SNSSupportItem sNSSupportItem, String str, String str2, Type type, String str3, Drawable drawable, String str4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sNSSupportItem.title;
        }
        if ((i11 & 2) != 0) {
            str2 = sNSSupportItem.subtitle;
        }
        if ((i11 & 4) != 0) {
            type = sNSSupportItem.type;
        }
        if ((i11 & 8) != 0) {
            str3 = sNSSupportItem.value;
        }
        if ((i11 & 16) != 0) {
            drawable = sNSSupportItem.iconDrawable;
        }
        if ((i11 & 32) != 0) {
            str4 = sNSSupportItem.iconName;
        }
        if ((i11 & 64) != 0) {
            function1 = sNSSupportItem.onClick;
        }
        String str5 = str4;
        Function1 function2 = function1;
        Drawable drawable2 = drawable;
        Type type2 = type;
        return sNSSupportItem.copy(str, str2, type2, str3, drawable2, str5, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @Nullable
    public final Function1<SNSSupportItem, Unit> component7() {
        return this.onClick;
    }

    @NotNull
    public final SNSSupportItem copy(@Nullable String title, @Nullable String subtitle, @NotNull Type type, @NotNull String value, @Nullable Drawable iconDrawable, @Nullable String iconName, @Nullable Function1<? super SNSSupportItem, Unit> onClick) {
        return new SNSSupportItem(title, subtitle, type, value, iconDrawable, iconName, onClick);
    }

    @Nullable
    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    @Nullable
    public final String getIconName() {
        return this.iconName;
    }

    @Nullable
    public final Function1<SNSSupportItem, Unit> getOnClick() {
        return this.onClick;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iM68983a = AbstractC27897U.m68983a(this.value, (this.type.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        Drawable drawable = this.iconDrawable;
        int iHashCode2 = (iM68983a + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str3 = this.iconName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Function1<SNSSupportItem, Unit> function1 = this.onClick;
        return iHashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    @Nullable
    public final String isValid() {
        if (this.value.length() == 0 || StringsKt.isBlank(this.value)) {
            return this + ". Value must not be empty or blank.";
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i11 == 1) {
            if (Patterns.WEB_URL.matcher(this.value).matches()) {
                return null;
            }
            return this + ". Invalid url format";
        }
        if (i11 == 2) {
            if (Patterns.EMAIL_ADDRESS.matcher(this.value).matches()) {
                return null;
            }
            return this + ". Invalid email format";
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.onClick != null) {
            return null;
        }
        return this + ". You have to implement your own onClick callback if you want to use a Custom type.";
    }

    @NotNull
    public String toString() {
        return "SNSSupportItem(title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + ", value=" + this.value + ", iconDrawable=" + this.iconDrawable + ", iconName=" + this.iconName + ", onClick=" + this.onClick + ")";
    }

    public /* synthetic */ SNSSupportItem(String str, String str2, Type type, String str3, Drawable drawable, String str4, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, type, str3, (i11 & 16) != 0 ? null : drawable, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : function1);
    }
}
