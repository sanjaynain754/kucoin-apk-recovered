package com.kubi.kucoin.home.p090v2.cardsconfig;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CardListRspV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000267B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Jf\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0007J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001c\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;", "Landroid/os/Parcelable;", "allWidgetMD5", "", "allWidgetChange", "", "userCustomVersion", "", "maxEditWidgetNum", "allWidgetList", "", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$AppWidgetConfigVO;", "userCustomWidgetList", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$UserCustomWidget;", "feedEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;IILjava/util/List;Ljava/util/List;Z)V", "getAllWidgetMD5", "()Ljava/lang/String;", "getAllWidgetChange", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserCustomVersion", "()I", "setUserCustomVersion", "(I)V", "getMaxEditWidgetNum", "getAllWidgetList", "()Ljava/util/List;", "getUserCustomWidgetList", "setUserCustomWidgetList", "(Ljava/util/List;)V", "getFeedEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;IILjava/util/List;Ljava/util/List;Z)Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AppWidgetConfigVO", "UserCustomWidget", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CardListRspV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardListRspV2> CREATOR = new C15412a();

    @Nullable
    private final Boolean allWidgetChange;

    @Nullable
    private final List<AppWidgetConfigVO> allWidgetList;

    @Nullable
    private final String allWidgetMD5;
    private final boolean feedEnabled;
    private final int maxEditWidgetNum;
    private int userCustomVersion;

    @NotNull
    private List<UserCustomWidget> userCustomWidgetList;

    /* JADX INFO: compiled from: CardListRspV2.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010$\u001a\u00020\u0007J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006/"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$AppWidgetConfigVO;", "Landroid/os/Parcelable;", "code", "", TtmlNode.TAG_STYLE, "", "loadMode", "", "repeatable", "", "title", "subTitle", "isFixed", "defaultData", "<init>", "(Ljava/lang/String;Ljava/util/List;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getStyle", "()Ljava/util/List;", "getLoadMode", "()I", "getRepeatable", "()Z", "getTitle", "getSubTitle", "getDefaultData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AppWidgetConfigVO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AppWidgetConfigVO> CREATOR = new C15410a();

        @NotNull
        private final String code;

        @Nullable
        private final String defaultData;
        private final boolean isFixed;
        private final int loadMode;
        private final boolean repeatable;

        @NotNull
        private final List<String> style;

        @NotNull
        private final String subTitle;

        @NotNull
        private final String title;

        /* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2$AppWidgetConfigVO$a */
        /* JADX INFO: compiled from: CardListRspV2.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C15410a implements Parcelable.Creator<AppWidgetConfigVO> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppWidgetConfigVO createFromParcel(Parcel parcel) {
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i11 = parcel.readInt();
                boolean z12 = false;
                if (parcel.readInt() != 0) {
                    z12 = true;
                    z11 = true;
                } else {
                    z11 = true;
                }
                String string2 = parcel.readString();
                boolean z13 = z11;
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z13 = false;
                }
                return new AppWidgetConfigVO(string, arrayListCreateStringArrayList, i11, z12, string2, string3, z13, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppWidgetConfigVO[] newArray(int i11) {
                return new AppWidgetConfigVO[i11];
            }
        }

        public AppWidgetConfigVO(@NotNull String code, @NotNull List<String> style, int i11, boolean z11, @NotNull String title, @NotNull String subTitle, boolean z12, @Nullable String str) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subTitle, "subTitle");
            this.code = code;
            this.style = style;
            this.loadMode = i11;
            this.repeatable = z11;
            this.title = title;
            this.subTitle = subTitle;
            this.isFixed = z12;
            this.defaultData = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppWidgetConfigVO)) {
                return false;
            }
            AppWidgetConfigVO appWidgetConfigVO = (AppWidgetConfigVO) other;
            return Intrinsics.areEqual(this.code, appWidgetConfigVO.code) && Intrinsics.areEqual(this.style, appWidgetConfigVO.style) && this.loadMode == appWidgetConfigVO.loadMode && this.repeatable == appWidgetConfigVO.repeatable && Intrinsics.areEqual(this.title, appWidgetConfigVO.title) && Intrinsics.areEqual(this.subTitle, appWidgetConfigVO.subTitle) && this.isFixed == appWidgetConfigVO.isFixed && Intrinsics.areEqual(this.defaultData, appWidgetConfigVO.defaultData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AppWidgetConfigVO copy$default(AppWidgetConfigVO appWidgetConfigVO, String str, List list, int i11, boolean z11, String str2, String str3, boolean z12, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = appWidgetConfigVO.code;
            }
            if ((i12 & 2) != 0) {
                list = appWidgetConfigVO.style;
            }
            if ((i12 & 4) != 0) {
                i11 = appWidgetConfigVO.loadMode;
            }
            if ((i12 & 8) != 0) {
                z11 = appWidgetConfigVO.repeatable;
            }
            if ((i12 & 16) != 0) {
                str2 = appWidgetConfigVO.title;
            }
            if ((i12 & 32) != 0) {
                str3 = appWidgetConfigVO.subTitle;
            }
            if ((i12 & 64) != 0) {
                z12 = appWidgetConfigVO.isFixed;
            }
            if ((i12 & 128) != 0) {
                str4 = appWidgetConfigVO.defaultData;
            }
            boolean z13 = z12;
            String str5 = str4;
            String str6 = str2;
            String str7 = str3;
            return appWidgetConfigVO.copy(str, list, i11, z11, str6, str7, z13, str5);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final List<String> component2() {
            return this.style;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getLoadMode() {
            return this.loadMode;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getRepeatable() {
            return this.repeatable;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSubTitle() {
            return this.subTitle;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsFixed() {
            return this.isFixed;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getDefaultData() {
            return this.defaultData;
        }

        @NotNull
        public final AppWidgetConfigVO copy(@NotNull String code, @NotNull List<String> style, int loadMode, boolean repeatable, @NotNull String title, @NotNull String subTitle, boolean isFixed, @Nullable String defaultData) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subTitle, "subTitle");
            return new AppWidgetConfigVO(code, style, loadMode, repeatable, title, subTitle, isFixed, defaultData);
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getDefaultData() {
            return this.defaultData;
        }

        public final int getLoadMode() {
            return this.loadMode;
        }

        public final boolean getRepeatable() {
            return this.repeatable;
        }

        @NotNull
        public final List<String> getStyle() {
            return this.style;
        }

        @NotNull
        public final String getSubTitle() {
            return this.subTitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.code.hashCode() * 31) + this.style.hashCode()) * 31) + Integer.hashCode(this.loadMode)) * 31) + Boolean.hashCode(this.repeatable)) * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + Boolean.hashCode(this.isFixed)) * 31;
            String str = this.defaultData;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean isFixed() {
            return this.isFixed;
        }

        @NotNull
        public String toString() {
            return "AppWidgetConfigVO(code=" + this.code + ", style=" + this.style + ", loadMode=" + this.loadMode + ", repeatable=" + this.repeatable + ", title=" + this.title + ", subTitle=" + this.subTitle + ", isFixed=" + this.isFixed + ", defaultData=" + this.defaultData + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code);
            dest.writeStringList(this.style);
            dest.writeInt(this.loadMode);
            dest.writeInt(this.repeatable ? 1 : 0);
            dest.writeString(this.title);
            dest.writeString(this.subTitle);
            dest.writeInt(this.isFixed ? 1 : 0);
            dest.writeString(this.defaultData);
        }

        public /* synthetic */ AppWidgetConfigVO(String str, List list, int i11, boolean z11, String str2, String str3, boolean z12, String str4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, i11, z11, str2, str3, z12, (i12 & 128) != 0 ? null : str4);
        }
    }

    /* JADX INFO: compiled from: CardListRspV2.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$UserCustomWidget;", "Landroid/os/Parcelable;", "code", "", TtmlNode.TAG_STYLE, "actualData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getStyle", "getActualData", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UserCustomWidget implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UserCustomWidget> CREATOR = new C15411a();

        @Nullable
        private final String actualData;

        @NotNull
        private final String code;

        @NotNull
        private final String style;

        /* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2$UserCustomWidget$a */
        /* JADX INFO: compiled from: CardListRspV2.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C15411a implements Parcelable.Creator<UserCustomWidget> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserCustomWidget createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserCustomWidget(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UserCustomWidget[] newArray(int i11) {
                return new UserCustomWidget[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserCustomWidget)) {
                return false;
            }
            UserCustomWidget userCustomWidget = (UserCustomWidget) other;
            return Intrinsics.areEqual(this.code, userCustomWidget.code) && Intrinsics.areEqual(this.style, userCustomWidget.style) && Intrinsics.areEqual(this.actualData, userCustomWidget.actualData);
        }

        public UserCustomWidget(@NotNull String code, @NotNull String style, @Nullable String str) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(style, "style");
            this.code = code;
            this.style = style;
            this.actualData = str;
        }

        public static /* synthetic */ UserCustomWidget copy$default(UserCustomWidget userCustomWidget, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = userCustomWidget.code;
            }
            if ((i11 & 2) != 0) {
                str2 = userCustomWidget.style;
            }
            if ((i11 & 4) != 0) {
                str3 = userCustomWidget.actualData;
            }
            return userCustomWidget.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getActualData() {
            return this.actualData;
        }

        @NotNull
        public final UserCustomWidget copy(@NotNull String code, @NotNull String style, @Nullable String actualData) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(style, "style");
            return new UserCustomWidget(code, style, actualData);
        }

        @Nullable
        public final String getActualData() {
            return this.actualData;
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final String getStyle() {
            return this.style;
        }

        public int hashCode() {
            int iHashCode = ((this.code.hashCode() * 31) + this.style.hashCode()) * 31;
            String str = this.actualData;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "UserCustomWidget(code=" + this.code + ", style=" + this.style + ", actualData=" + this.actualData + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code);
            dest.writeString(this.style);
            dest.writeString(this.actualData);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cardsconfig.CardListRspV2$a */
    /* JADX INFO: compiled from: CardListRspV2.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15412a implements Parcelable.Creator<CardListRspV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardListRspV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(AppWidgetConfigVO.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            int i15 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList3.add(UserCustomWidget.CREATOR.createFromParcel(parcel));
            }
            return new CardListRspV2(string, boolValueOf, i11, i12, arrayList, arrayList3, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CardListRspV2[] newArray(int i11) {
            return new CardListRspV2[i11];
        }
    }

    public CardListRspV2(@Nullable String str, @Nullable Boolean bool, int i11, int i12, @Nullable List<AppWidgetConfigVO> list, @NotNull List<UserCustomWidget> userCustomWidgetList, boolean z11) {
        Intrinsics.checkNotNullParameter(userCustomWidgetList, "userCustomWidgetList");
        this.allWidgetMD5 = str;
        this.allWidgetChange = bool;
        this.userCustomVersion = i11;
        this.maxEditWidgetNum = i12;
        this.allWidgetList = list;
        this.userCustomWidgetList = userCustomWidgetList;
        this.feedEnabled = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardListRspV2)) {
            return false;
        }
        CardListRspV2 cardListRspV2 = (CardListRspV2) other;
        return Intrinsics.areEqual(this.allWidgetMD5, cardListRspV2.allWidgetMD5) && Intrinsics.areEqual(this.allWidgetChange, cardListRspV2.allWidgetChange) && this.userCustomVersion == cardListRspV2.userCustomVersion && this.maxEditWidgetNum == cardListRspV2.maxEditWidgetNum && Intrinsics.areEqual(this.allWidgetList, cardListRspV2.allWidgetList) && Intrinsics.areEqual(this.userCustomWidgetList, cardListRspV2.userCustomWidgetList) && this.feedEnabled == cardListRspV2.feedEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardListRspV2 copy$default(CardListRspV2 cardListRspV2, String str, Boolean bool, int i11, int i12, List list, List list2, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cardListRspV2.allWidgetMD5;
        }
        if ((i13 & 2) != 0) {
            bool = cardListRspV2.allWidgetChange;
        }
        if ((i13 & 4) != 0) {
            i11 = cardListRspV2.userCustomVersion;
        }
        if ((i13 & 8) != 0) {
            i12 = cardListRspV2.maxEditWidgetNum;
        }
        if ((i13 & 16) != 0) {
            list = cardListRspV2.allWidgetList;
        }
        if ((i13 & 32) != 0) {
            list2 = cardListRspV2.userCustomWidgetList;
        }
        if ((i13 & 64) != 0) {
            z11 = cardListRspV2.feedEnabled;
        }
        List list3 = list2;
        boolean z12 = z11;
        List list4 = list;
        int i14 = i11;
        return cardListRspV2.copy(str, bool, i14, i12, list4, list3, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllWidgetMD5() {
        return this.allWidgetMD5;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAllWidgetChange() {
        return this.allWidgetChange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUserCustomVersion() {
        return this.userCustomVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxEditWidgetNum() {
        return this.maxEditWidgetNum;
    }

    @Nullable
    public final List<AppWidgetConfigVO> component5() {
        return this.allWidgetList;
    }

    @NotNull
    public final List<UserCustomWidget> component6() {
        return this.userCustomWidgetList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getFeedEnabled() {
        return this.feedEnabled;
    }

    @NotNull
    public final CardListRspV2 copy(@Nullable String allWidgetMD5, @Nullable Boolean allWidgetChange, int userCustomVersion, int maxEditWidgetNum, @Nullable List<AppWidgetConfigVO> allWidgetList, @NotNull List<UserCustomWidget> userCustomWidgetList, boolean feedEnabled) {
        Intrinsics.checkNotNullParameter(userCustomWidgetList, "userCustomWidgetList");
        return new CardListRspV2(allWidgetMD5, allWidgetChange, userCustomVersion, maxEditWidgetNum, allWidgetList, userCustomWidgetList, feedEnabled);
    }

    @Nullable
    public final Boolean getAllWidgetChange() {
        return this.allWidgetChange;
    }

    @Nullable
    public final List<AppWidgetConfigVO> getAllWidgetList() {
        return this.allWidgetList;
    }

    @Nullable
    public final String getAllWidgetMD5() {
        return this.allWidgetMD5;
    }

    public final boolean getFeedEnabled() {
        return this.feedEnabled;
    }

    public final int getMaxEditWidgetNum() {
        return this.maxEditWidgetNum;
    }

    public final int getUserCustomVersion() {
        return this.userCustomVersion;
    }

    @NotNull
    public final List<UserCustomWidget> getUserCustomWidgetList() {
        return this.userCustomWidgetList;
    }

    public int hashCode() {
        String str = this.allWidgetMD5;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.allWidgetChange;
        int iHashCode2 = (((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Integer.hashCode(this.userCustomVersion)) * 31) + Integer.hashCode(this.maxEditWidgetNum)) * 31;
        List<AppWidgetConfigVO> list = this.allWidgetList;
        return ((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.userCustomWidgetList.hashCode()) * 31) + Boolean.hashCode(this.feedEnabled);
    }

    public final void setUserCustomVersion(int i11) {
        this.userCustomVersion = i11;
    }

    public final void setUserCustomWidgetList(@NotNull List<UserCustomWidget> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.userCustomWidgetList = list;
    }

    @NotNull
    public String toString() {
        return "CardListRspV2(allWidgetMD5=" + this.allWidgetMD5 + ", allWidgetChange=" + this.allWidgetChange + ", userCustomVersion=" + this.userCustomVersion + ", maxEditWidgetNum=" + this.maxEditWidgetNum + ", allWidgetList=" + this.allWidgetList + ", userCustomWidgetList=" + this.userCustomWidgetList + ", feedEnabled=" + this.feedEnabled + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.allWidgetMD5);
        Boolean bool = this.allWidgetChange;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.userCustomVersion);
        dest.writeInt(this.maxEditWidgetNum);
        List<AppWidgetConfigVO> list = this.allWidgetList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<AppWidgetConfigVO> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<UserCustomWidget> list2 = this.userCustomWidgetList;
        dest.writeInt(list2.size());
        Iterator<UserCustomWidget> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.feedEnabled ? 1 : 0);
    }

    public /* synthetic */ CardListRspV2(String str, Boolean bool, int i11, int i12, List list, List list2, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? Boolean.TRUE : bool, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 8 : i12, (i13 & 16) != 0 ? null : list, list2, (i13 & 64) != 0 ? false : z11);
    }
}
