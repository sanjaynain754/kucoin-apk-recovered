package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0001qBø\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010 J\b\u0010M\u001a\u00020NH\u0016J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010+J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0016\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0002\b\u0013HÆ\u0003J\t\u0010Z\u001a\u00020\tHÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\tHÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0091\u0002\u0010d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010eJ\u0006\u0010f\u001a\u00020NJ\u0013\u0010g\u001a\u00020\t2\b\u0010h\u001a\u0004\u0018\u00010iHÖ\u0003J\t\u0010j\u001a\u00020NHÖ\u0001J\t\u0010k\u001a\u00020\u0004HÖ\u0001J\u0016\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020NR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b\b\u0010+\"\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b\r\u0010+\"\u0004\b5\u0010-R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R'\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0002\b\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00107\"\u0004\b9\u0010 R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u0015\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010:\"\u0004\b=\u0010<R\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010:\"\u0004\b>\u0010<R\u001a\u0010\u0017\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010:\"\u0004\b?\u0010<R\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010:\"\u0004\b@\u0010<R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010$R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\"\"\u0004\bL\u0010$¨\u0006r"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddrEntity;", "Landroid/os/Parcelable;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "id", "", "address", "memo", "remark", "isOurAddress", "", "chainId", "chainName", "type", "isSingleChain", "chainList", "", "Lcom/kubi/assets/entity/MultiChainEntity;", "selectItemList", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "Lkotlinx/android/parcel/RawValue;", "isEditing", "isChecked", "isPlatform", "isClick", "isRecentlyAdded", "selectedChain", "favoriteAddressId", "favoriteAddressRemark", "favoriteAddressType", "favoriteAddressChainId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;ZZZZZLcom/kubi/assets/entity/MultiChainEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getAddress", "setAddress", "getMemo", "setMemo", "getRemark", "setRemark", "()Ljava/lang/Boolean;", "setOurAddress", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getChainId", "setChainId", "getChainName", "setChainName", "getType", "setType", "setSingleChain", "getChainList", "()Ljava/util/List;", "getSelectItemList", "setSelectItemList", "()Z", "setEditing", "(Z)V", "setChecked", "setPlatform", "setClick", "setRecentlyAdded", "getSelectedChain", "()Lcom/kubi/assets/entity/MultiChainEntity;", "setSelectedChain", "(Lcom/kubi/assets/entity/MultiChainEntity;)V", "getFavoriteAddressId", "setFavoriteAddressId", "getFavoriteAddressRemark", "setFavoriteAddressRemark", "getFavoriteAddressType", "setFavoriteAddressType", "getFavoriteAddressChainId", "setFavoriteAddressChainId", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;ZZZZZLcom/kubi/assets/entity/MultiChainEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/WithdrawAddrEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawEntity.kt\ncom/kubi/assets/entity/WithdrawAddrEntity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n1563#2:412\n1634#2,3:413\n*S KotlinDebug\n*F\n+ 1 WithdrawEntity.kt\ncom/kubi/assets/entity/WithdrawAddrEntity\n*L\n190#1:412\n190#1:413,3\n*E\n"})
public final /* data */ class WithdrawAddrEntity implements Parcelable, MultiItemEntity {
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_PLATFORM = 2;

    @Nullable
    private String address;

    @Nullable
    private String chainId;

    @Nullable
    private final List<MultiChainEntity> chainList;

    @Nullable
    private String chainName;

    @Nullable
    private String favoriteAddressChainId;

    @Nullable
    private String favoriteAddressId;

    @Nullable
    private String favoriteAddressRemark;

    @Nullable
    private String favoriteAddressType;

    @Nullable
    private String id;
    private boolean isChecked;
    private boolean isClick;
    private boolean isEditing;

    @Nullable
    private Boolean isOurAddress;
    private boolean isPlatform;
    private boolean isRecentlyAdded;

    @Nullable
    private Boolean isSingleChain;

    @Nullable
    private String memo;

    @Nullable
    private String remark;

    @Nullable
    private List<BottomSheetDialogHelper.InterfaceC24339a> selectItemList;

    @Nullable
    private MultiChainEntity selectedChain;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<WithdrawAddrEntity> CREATOR = new Creator();

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddrEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(MultiChainEntity.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readValue(WithdrawAddrEntity.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                z11 = true;
                z12 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            return new WithdrawAddrEntity(string, string2, string3, string4, boolValueOf, string5, string6, string7, boolValueOf2, arrayList, arrayList2, z12, parcel.readInt() != 0 ? z11 : false, parcel.readInt() != 0 ? z11 : false, parcel.readInt() != 0 ? z11 : false, parcel.readInt() != 0 ? z11 : false, parcel.readInt() == 0 ? null : MultiChainEntity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrEntity[] newArray(int i11) {
            return new WithdrawAddrEntity[i11];
        }
    }

    public WithdrawAddrEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool2, @Nullable List<MultiChainEntity> list, @Nullable List<BottomSheetDialogHelper.InterfaceC24339a> list2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @Nullable MultiChainEntity multiChainEntity, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.id = str;
        this.address = str2;
        this.memo = str3;
        this.remark = str4;
        this.isOurAddress = bool;
        this.chainId = str5;
        this.chainName = str6;
        this.type = str7;
        this.isSingleChain = bool2;
        this.chainList = list;
        this.selectItemList = list2;
        this.isEditing = z11;
        this.isChecked = z12;
        this.isPlatform = z13;
        this.isClick = z14;
        this.isRecentlyAdded = z15;
        this.selectedChain = multiChainEntity;
        this.favoriteAddressId = str8;
        this.favoriteAddressRemark = str9;
        this.favoriteAddressType = str10;
        this.favoriteAddressChainId = str11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawAddrEntity copy$default(WithdrawAddrEntity withdrawAddrEntity, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, Boolean bool2, List list, List list2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, MultiChainEntity multiChainEntity, String str8, String str9, String str10, String str11, int i11, Object obj) {
        String str12;
        String str13;
        String str14 = (i11 & 1) != 0 ? withdrawAddrEntity.id : str;
        String str15 = (i11 & 2) != 0 ? withdrawAddrEntity.address : str2;
        String str16 = (i11 & 4) != 0 ? withdrawAddrEntity.memo : str3;
        String str17 = (i11 & 8) != 0 ? withdrawAddrEntity.remark : str4;
        Boolean bool3 = (i11 & 16) != 0 ? withdrawAddrEntity.isOurAddress : bool;
        String str18 = (i11 & 32) != 0 ? withdrawAddrEntity.chainId : str5;
        String str19 = (i11 & 64) != 0 ? withdrawAddrEntity.chainName : str6;
        String str20 = (i11 & 128) != 0 ? withdrawAddrEntity.type : str7;
        Boolean bool4 = (i11 & 256) != 0 ? withdrawAddrEntity.isSingleChain : bool2;
        List list3 = (i11 & 512) != 0 ? withdrawAddrEntity.chainList : list;
        List list4 = (i11 & 1024) != 0 ? withdrawAddrEntity.selectItemList : list2;
        boolean z16 = (i11 & 2048) != 0 ? withdrawAddrEntity.isEditing : z11;
        boolean z17 = (i11 & 4096) != 0 ? withdrawAddrEntity.isChecked : z12;
        boolean z18 = (i11 & 8192) != 0 ? withdrawAddrEntity.isPlatform : z13;
        String str21 = str14;
        boolean z19 = (i11 & 16384) != 0 ? withdrawAddrEntity.isClick : z14;
        boolean z21 = (i11 & 32768) != 0 ? withdrawAddrEntity.isRecentlyAdded : z15;
        MultiChainEntity multiChainEntity2 = (i11 & 65536) != 0 ? withdrawAddrEntity.selectedChain : multiChainEntity;
        String str22 = (i11 & 131072) != 0 ? withdrawAddrEntity.favoriteAddressId : str8;
        String str23 = (i11 & 262144) != 0 ? withdrawAddrEntity.favoriteAddressRemark : str9;
        String str24 = (i11 & 524288) != 0 ? withdrawAddrEntity.favoriteAddressType : str10;
        if ((i11 & 1048576) != 0) {
            str13 = str24;
            str12 = withdrawAddrEntity.favoriteAddressChainId;
        } else {
            str12 = str11;
            str13 = str24;
        }
        return withdrawAddrEntity.copy(str21, str15, str16, str17, bool3, str18, str19, str20, bool4, list3, list4, z16, z17, z18, z19, z21, multiChainEntity2, str22, str23, str13, str12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawAddrEntity)) {
            return false;
        }
        WithdrawAddrEntity withdrawAddrEntity = (WithdrawAddrEntity) other;
        return Intrinsics.areEqual(this.id, withdrawAddrEntity.id) && Intrinsics.areEqual(this.address, withdrawAddrEntity.address) && Intrinsics.areEqual(this.memo, withdrawAddrEntity.memo) && Intrinsics.areEqual(this.remark, withdrawAddrEntity.remark) && Intrinsics.areEqual(this.isOurAddress, withdrawAddrEntity.isOurAddress) && Intrinsics.areEqual(this.chainId, withdrawAddrEntity.chainId) && Intrinsics.areEqual(this.chainName, withdrawAddrEntity.chainName) && Intrinsics.areEqual(this.type, withdrawAddrEntity.type) && Intrinsics.areEqual(this.isSingleChain, withdrawAddrEntity.isSingleChain) && Intrinsics.areEqual(this.chainList, withdrawAddrEntity.chainList) && Intrinsics.areEqual(this.selectItemList, withdrawAddrEntity.selectItemList) && this.isEditing == withdrawAddrEntity.isEditing && this.isChecked == withdrawAddrEntity.isChecked && this.isPlatform == withdrawAddrEntity.isPlatform && this.isClick == withdrawAddrEntity.isClick && this.isRecentlyAdded == withdrawAddrEntity.isRecentlyAdded && Intrinsics.areEqual(this.selectedChain, withdrawAddrEntity.selectedChain) && Intrinsics.areEqual(this.favoriteAddressId, withdrawAddrEntity.favoriteAddressId) && Intrinsics.areEqual(this.favoriteAddressRemark, withdrawAddrEntity.favoriteAddressRemark) && Intrinsics.areEqual(this.favoriteAddressType, withdrawAddrEntity.favoriteAddressType) && Intrinsics.areEqual(this.favoriteAddressChainId, withdrawAddrEntity.favoriteAddressChainId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<MultiChainEntity> component10() {
        return this.chainList;
    }

    @Nullable
    public final List<BottomSheetDialogHelper.InterfaceC24339a> component11() {
        return this.selectItemList;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsPlatform() {
        return this.isPlatform;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsClick() {
        return this.isClick;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final MultiChainEntity getSelectedChain() {
        return this.selectedChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getFavoriteAddressId() {
        return this.favoriteAddressId;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getFavoriteAddressRemark() {
        return this.favoriteAddressRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getFavoriteAddressType() {
        return this.favoriteAddressType;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getFavoriteAddressChainId() {
        return this.favoriteAddressChainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsOurAddress() {
        return this.isOurAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsSingleChain() {
        return this.isSingleChain;
    }

    @NotNull
    public final WithdrawAddrEntity copy(@Nullable String id2, @Nullable String address, @Nullable String memo, @Nullable String remark, @Nullable Boolean isOurAddress, @Nullable String chainId, @Nullable String chainName, @Nullable String type, @Nullable Boolean isSingleChain, @Nullable List<MultiChainEntity> chainList, @Nullable List<BottomSheetDialogHelper.InterfaceC24339a> selectItemList, boolean isEditing, boolean isChecked, boolean isPlatform, boolean isClick, boolean isRecentlyAdded, @Nullable MultiChainEntity selectedChain, @Nullable String favoriteAddressId, @Nullable String favoriteAddressRemark, @Nullable String favoriteAddressType, @Nullable String favoriteAddressChainId) {
        return new WithdrawAddrEntity(id2, address, memo, remark, isOurAddress, chainId, chainName, type, isSingleChain, chainList, selectItemList, isEditing, isChecked, isPlatform, isClick, isRecentlyAdded, selectedChain, favoriteAddressId, favoriteAddressRemark, favoriteAddressType, favoriteAddressChainId);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final List<MultiChainEntity> getChainList() {
        return this.chainList;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    public final String getFavoriteAddressChainId() {
        return this.favoriteAddressChainId;
    }

    @Nullable
    public final String getFavoriteAddressId() {
        return this.favoriteAddressId;
    }

    @Nullable
    public final String getFavoriteAddressRemark() {
        return this.favoriteAddressRemark;
    }

    @Nullable
    public final String getFavoriteAddressType() {
        return this.favoriteAddressType;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF38450c() {
        String str = this.memo;
        return (str == null || str.length() == 0) ? 1 : 2;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final List<BottomSheetDialogHelper.InterfaceC24339a> getSelectItemList() {
        return this.selectItemList;
    }

    @Nullable
    public final MultiChainEntity getSelectedChain() {
        return this.selectedChain;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.memo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.remark;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isOurAddress;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.chainId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.chainName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.type;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.isSingleChain;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<MultiChainEntity> list = this.chainList;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<BottomSheetDialogHelper.InterfaceC24339a> list2 = this.selectItemList;
        int iHashCode11 = (((((((((((iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.isPlatform)) * 31) + Boolean.hashCode(this.isClick)) * 31) + Boolean.hashCode(this.isRecentlyAdded)) * 31;
        MultiChainEntity multiChainEntity = this.selectedChain;
        int iHashCode12 = (iHashCode11 + (multiChainEntity == null ? 0 : multiChainEntity.hashCode())) * 31;
        String str8 = this.favoriteAddressId;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.favoriteAddressRemark;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.favoriteAddressType;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.favoriteAddressChainId;
        return iHashCode15 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final boolean isClick() {
        return this.isClick;
    }

    public final boolean isEditing() {
        return this.isEditing;
    }

    @Nullable
    public final Boolean isOurAddress() {
        return this.isOurAddress;
    }

    public final boolean isPlatform() {
        return this.isPlatform;
    }

    public final boolean isRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    @Nullable
    public final Boolean isSingleChain() {
        return this.isSingleChain;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setChainId(@Nullable String str) {
        this.chainId = str;
    }

    public final void setChainName(@Nullable String str) {
        this.chainName = str;
    }

    public final void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    public final void setClick(boolean z11) {
        this.isClick = z11;
    }

    public final void setEditing(boolean z11) {
        this.isEditing = z11;
    }

    public final void setFavoriteAddressChainId(@Nullable String str) {
        this.favoriteAddressChainId = str;
    }

    public final void setFavoriteAddressId(@Nullable String str) {
        this.favoriteAddressId = str;
    }

    public final void setFavoriteAddressRemark(@Nullable String str) {
        this.favoriteAddressRemark = str;
    }

    public final void setFavoriteAddressType(@Nullable String str) {
        this.favoriteAddressType = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setMemo(@Nullable String str) {
        this.memo = str;
    }

    public final void setOurAddress(@Nullable Boolean bool) {
        this.isOurAddress = bool;
    }

    public final void setPlatform(boolean z11) {
        this.isPlatform = z11;
    }

    public final void setRecentlyAdded(boolean z11) {
        this.isRecentlyAdded = z11;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setSelectItemList(@Nullable List<BottomSheetDialogHelper.InterfaceC24339a> list) {
        this.selectItemList = list;
    }

    public final void setSelectedChain(@Nullable MultiChainEntity multiChainEntity) {
        this.selectedChain = multiChainEntity;
    }

    public final void setSingleChain(@Nullable Boolean bool) {
        this.isSingleChain = bool;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "WithdrawAddrEntity(id=" + this.id + ", address=" + this.address + ", memo=" + this.memo + ", remark=" + this.remark + ", isOurAddress=" + this.isOurAddress + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", type=" + this.type + ", isSingleChain=" + this.isSingleChain + ", chainList=" + this.chainList + ", selectItemList=" + this.selectItemList + ", isEditing=" + this.isEditing + ", isChecked=" + this.isChecked + ", isPlatform=" + this.isPlatform + ", isClick=" + this.isClick + ", isRecentlyAdded=" + this.isRecentlyAdded + ", selectedChain=" + this.selectedChain + ", favoriteAddressId=" + this.favoriteAddressId + ", favoriteAddressRemark=" + this.favoriteAddressRemark + ", favoriteAddressType=" + this.favoriteAddressType + ", favoriteAddressChainId=" + this.favoriteAddressChainId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.address);
        dest.writeString(this.memo);
        dest.writeString(this.remark);
        Boolean bool = this.isOurAddress;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.chainId);
        dest.writeString(this.chainName);
        dest.writeString(this.type);
        Boolean bool2 = this.isSingleChain;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<MultiChainEntity> list = this.chainList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<MultiChainEntity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<BottomSheetDialogHelper.InterfaceC24339a> list2 = this.selectItemList;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<BottomSheetDialogHelper.InterfaceC24339a> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeValue(it2.next());
            }
        }
        dest.writeInt(this.isEditing ? 1 : 0);
        dest.writeInt(this.isChecked ? 1 : 0);
        dest.writeInt(this.isPlatform ? 1 : 0);
        dest.writeInt(this.isClick ? 1 : 0);
        dest.writeInt(this.isRecentlyAdded ? 1 : 0);
        MultiChainEntity multiChainEntity = this.selectedChain;
        if (multiChainEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            multiChainEntity.writeToParcel(dest, flags);
        }
        dest.writeString(this.favoriteAddressId);
        dest.writeString(this.favoriteAddressRemark);
        dest.writeString(this.favoriteAddressType);
        dest.writeString(this.favoriteAddressChainId);
    }

    public /* synthetic */ WithdrawAddrEntity(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, Boolean bool2, List list, List list2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, MultiChainEntity multiChainEntity, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, bool, str5, str6, str7, bool2, (i11 & 512) != 0 ? new ArrayList() : list, (i11 & 1024) != 0 ? new ArrayList() : list2, (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? false : z12, (i11 & 8192) != 0 ? false : z13, (i11 & 16384) != 0 ? true : z14, (32768 & i11) != 0 ? false : z15, (65536 & i11) != 0 ? null : multiChainEntity, (131072 & i11) != 0 ? null : str8, (262144 & i11) != 0 ? null : str9, (524288 & i11) != 0 ? null : str10, (i11 & 1048576) != 0 ? null : str11);
    }

    public /* synthetic */ WithdrawAddrEntity(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }

    public WithdrawAddrEntity(@Nullable List<MultiChainEntity> list) {
        this(null, null, null, null, null, null, null, null, Boolean.TRUE, list, null, false, false, false, false, false, null, null, null, null, null, 2096128, null);
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (MultiChainEntity multiChainEntity : list) {
            arrayList.add(new SelectEntity(null, multiChainEntity.getChainName(), multiChainEntity.getChainId(), null, null, null, null, null, null, false, false, null, 4089, null));
        }
        this.selectItemList = CollectionsKt.toMutableList((Collection) arrayList);
    }
}
