package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mt.InterfaceC42618d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\n\u001a\u00020\u0014J\u0006\u00103\u001a\u00020\u0004J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010&J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0014HÆ\u0003J\t\u0010@\u001a\u00020\u0004HÆ\u0003J²\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010BJ\u0006\u0010C\u001a\u00020\u000bJ\u0013\u0010D\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u000bHÖ\u0001J\t\u0010H\u001a\u00020\u0004HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\n\u0010\u001fR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010.R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0015\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b0\u0010.¨\u0006N"}, m90084d2 = {"Lcom/kubi/otc/entity/PayTypeEntity;", "Landroid/os/Parcelable;", "Lcom/kubi/otc/view/StickySection;", "id", "", "type", "typeCode", "typeName", "typeNameEn", TUIConstants.TUIChat.INPUT_MORE_ICON, "isCommonlyUsed", "", "template", "", "Lcom/kubi/otc/entity/PayTemplate;", "firstLetter", "", "nameLetter", "color", "isTitle", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Character;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getTypeCode", "getTypeName", "getTypeNameEn", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTemplate", "()Ljava/util/List;", "setTemplate", "(Ljava/util/List;)V", "getFirstLetter", "()Ljava/lang/Character;", "setFirstLetter", "(Ljava/lang/Character;)V", "Ljava/lang/Character;", "getNameLetter", "setNameLetter", "getColor", "setColor", "(Ljava/lang/String;)V", "()Z", "setTitle", "(Z)V", "getTitle", "getShowTypeName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Character;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)Lcom/kubi/otc/entity/PayTypeEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayTypeEntity implements Parcelable, InterfaceC42618d0 {

    @NotNull
    public static final Parcelable.Creator<PayTypeEntity> CREATOR = new Creator();

    @Nullable
    private String color;

    @Nullable
    private Character firstLetter;

    @Nullable
    private final String icon;

    @Nullable
    private final String id;

    @Nullable
    private final Integer isCommonlyUsed;
    private boolean isTitle;

    @Nullable
    private List<String> nameLetter;

    @Nullable
    private List<PayTemplate> template;

    @NotNull
    private String title;

    @Nullable
    private final String type;

    @Nullable
    private final String typeCode;

    @Nullable
    private final String typeName;

    @Nullable
    private final String typeNameEn;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<PayTypeEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayTypeEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(PayTemplate.CREATOR.createFromParcel(parcel));
                }
            }
            return new PayTypeEntity(string, string2, string3, string4, string5, string6, numValueOf, arrayList, parcel.readInt() != 0 ? Character.valueOf((char) parcel.readInt()) : null, parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayTypeEntity[] newArray(int i11) {
            return new PayTypeEntity[i11];
        }
    }

    public PayTypeEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable List<PayTemplate> list, @Nullable Character ch2, @Nullable List<String> list2, @Nullable String str7, boolean z11, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = str;
        this.type = str2;
        this.typeCode = str3;
        this.typeName = str4;
        this.typeNameEn = str5;
        this.icon = str6;
        this.isCommonlyUsed = num;
        this.template = list;
        this.firstLetter = ch2;
        this.nameLetter = list2;
        this.color = str7;
        this.isTitle = z11;
        this.title = title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayTypeEntity copy$default(PayTypeEntity payTypeEntity, String str, String str2, String str3, String str4, String str5, String str6, Integer num, List list, Character ch2, List list2, String str7, boolean z11, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = payTypeEntity.id;
        }
        return payTypeEntity.copy(str, (i11 & 2) != 0 ? payTypeEntity.type : str2, (i11 & 4) != 0 ? payTypeEntity.typeCode : str3, (i11 & 8) != 0 ? payTypeEntity.typeName : str4, (i11 & 16) != 0 ? payTypeEntity.typeNameEn : str5, (i11 & 32) != 0 ? payTypeEntity.icon : str6, (i11 & 64) != 0 ? payTypeEntity.isCommonlyUsed : num, (i11 & 128) != 0 ? payTypeEntity.template : list, (i11 & 256) != 0 ? payTypeEntity.firstLetter : ch2, (i11 & 512) != 0 ? payTypeEntity.nameLetter : list2, (i11 & 1024) != 0 ? payTypeEntity.color : str7, (i11 & 2048) != 0 ? payTypeEntity.isTitle : z11, (i11 & 4096) != 0 ? payTypeEntity.title : str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayTypeEntity)) {
            return false;
        }
        PayTypeEntity payTypeEntity = (PayTypeEntity) other;
        return Intrinsics.areEqual(this.id, payTypeEntity.id) && Intrinsics.areEqual(this.type, payTypeEntity.type) && Intrinsics.areEqual(this.typeCode, payTypeEntity.typeCode) && Intrinsics.areEqual(this.typeName, payTypeEntity.typeName) && Intrinsics.areEqual(this.typeNameEn, payTypeEntity.typeNameEn) && Intrinsics.areEqual(this.icon, payTypeEntity.icon) && Intrinsics.areEqual(this.isCommonlyUsed, payTypeEntity.isCommonlyUsed) && Intrinsics.areEqual(this.template, payTypeEntity.template) && Intrinsics.areEqual(this.firstLetter, payTypeEntity.firstLetter) && Intrinsics.areEqual(this.nameLetter, payTypeEntity.nameLetter) && Intrinsics.areEqual(this.color, payTypeEntity.color) && this.isTitle == payTypeEntity.isTitle && Intrinsics.areEqual(this.title, payTypeEntity.title);
    }

    @Nullable
    public final Integer isCommonlyUsed() {
        return this.isCommonlyUsed;
    }

    public void setTitle(boolean z11) {
        this.isTitle = z11;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> component10() {
        return this.nameLetter;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsTitle() {
        return this.isTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTypeCode() {
        return this.typeCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTypeNameEn() {
        return this.typeNameEn;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getIsCommonlyUsed() {
        return this.isCommonlyUsed;
    }

    @Nullable
    public final List<PayTemplate> component8() {
        return this.template;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Character getFirstLetter() {
        return this.firstLetter;
    }

    @NotNull
    public final PayTypeEntity copy(@Nullable String id2, @Nullable String type, @Nullable String typeCode, @Nullable String typeName, @Nullable String typeNameEn, @Nullable String icon, @Nullable Integer isCommonlyUsed, @Nullable List<PayTemplate> template, @Nullable Character firstLetter, @Nullable List<String> nameLetter, @Nullable String color, boolean isTitle, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new PayTypeEntity(id2, type, typeCode, typeName, typeNameEn, icon, isCommonlyUsed, template, firstLetter, nameLetter, color, isTitle, title);
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final Character getFirstLetter() {
        return this.firstLetter;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getNameLetter() {
        return this.nameLetter;
    }

    @Nullable
    public final List<PayTemplate> getTemplate() {
        return this.template;
    }

    @Override // mt.InterfaceC42618d0
    @NotNull
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getTypeCode() {
        return this.typeCode;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    @Nullable
    public final String getTypeNameEn() {
        return this.typeNameEn;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.typeCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.typeName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.typeNameEn;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.icon;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.isCommonlyUsed;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<PayTemplate> list = this.template;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Character ch2 = this.firstLetter;
        int iHashCode9 = (iHashCode8 + (ch2 == null ? 0 : ch2.hashCode())) * 31;
        List<String> list2 = this.nameLetter;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.color;
        return ((((iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31) + Boolean.hashCode(this.isTitle)) * 31) + this.title.hashCode();
    }

    /* JADX INFO: renamed from: isCommonlyUsed, reason: collision with other method in class */
    public final boolean m103797isCommonlyUsed() {
        Integer num = this.isCommonlyUsed;
        return num != null && num.intValue() == 1;
    }

    @Override // mt.InterfaceC42618d0
    public boolean isTitle() {
        return this.isTitle;
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setFirstLetter(@Nullable Character ch2) {
        this.firstLetter = ch2;
    }

    public final void setNameLetter(@Nullable List<String> list) {
        this.nameLetter = list;
    }

    public final void setTemplate(@Nullable List<PayTemplate> list) {
        this.template = list;
    }

    public void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "PayTypeEntity(id=" + this.id + ", type=" + this.type + ", typeCode=" + this.typeCode + ", typeName=" + this.typeName + ", typeNameEn=" + this.typeNameEn + ", icon=" + this.icon + ", isCommonlyUsed=" + this.isCommonlyUsed + ", template=" + this.template + ", firstLetter=" + this.firstLetter + ", nameLetter=" + this.nameLetter + ", color=" + this.color + ", isTitle=" + this.isTitle + ", title=" + this.title + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.typeCode);
        dest.writeString(this.typeName);
        dest.writeString(this.typeNameEn);
        dest.writeString(this.icon);
        Integer num = this.isCommonlyUsed;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        List<PayTemplate> list = this.template;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<PayTemplate> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Character ch2 = this.firstLetter;
        if (ch2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(ch2.charValue());
        }
        dest.writeStringList(this.nameLetter);
        dest.writeString(this.color);
        dest.writeInt(this.isTitle ? 1 : 0);
        dest.writeString(this.title);
    }

    @NotNull
    public final String getShowTypeName() {
        String str;
        if (MultiLanguageManager.m56980j()) {
            str = this.typeName;
        } else {
            str = this.typeNameEn;
        }
        return C27041f.m66668h(str);
    }

    public /* synthetic */ PayTypeEntity(String str, String str2, String str3, String str4, String str5, String str6, Integer num, List list, Character ch2, List list2, String str7, boolean z11, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, num, list, ch2, list2, str7, (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? "" : str8);
    }
}
