package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradingNoticeEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bc\u0012,\b\u0002\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006\u0012,\b\u0002\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R>\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR>\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "Landroid/os/Parcelable;", "webNoticeConfig", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "confirmConfig", "<init>", "(Ljava/util/HashMap;Ljava/util/HashMap;)V", "getWebNoticeConfig", "()Ljava/util/HashMap;", "setWebNoticeConfig", "(Ljava/util/HashMap;)V", "getConfirmConfig", "setConfirmConfig", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingNoticeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradingNoticeEntity> CREATOR = new C15826a();

    @Nullable
    private HashMap<String, Boolean> confirmConfig;

    @Nullable
    private HashMap<String, Boolean> webNoticeConfig;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.TradingNoticeEntity$a */
    /* JADX INFO: compiled from: TradingNoticeEntity.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15826a implements Parcelable.Creator<TradingNoticeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TradingNoticeEntity createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HashMap map2 = null;
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i11 = parcel.readInt();
                map = new HashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    map.put(parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                HashMap map3 = new HashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    map3.put(parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
                }
                map2 = map3;
            }
            return new TradingNoticeEntity(map, map2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TradingNoticeEntity[] newArray(int i11) {
            return new TradingNoticeEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TradingNoticeEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TradingNoticeEntity(@Nullable HashMap<String, Boolean> map, @Nullable HashMap<String, Boolean> map2) {
        this.webNoticeConfig = map;
        this.confirmConfig = map2;
    }

    @Nullable
    public final HashMap<String, Boolean> getConfirmConfig() {
        return this.confirmConfig;
    }

    @Nullable
    public final HashMap<String, Boolean> getWebNoticeConfig() {
        return this.webNoticeConfig;
    }

    public final void setConfirmConfig(@Nullable HashMap<String, Boolean> map) {
        this.confirmConfig = map;
    }

    public final void setWebNoticeConfig(@Nullable HashMap<String, Boolean> map) {
        this.webNoticeConfig = map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        HashMap<String, Boolean> map = this.webNoticeConfig;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                Boolean value = entry.getValue();
                if (value == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(value.booleanValue() ? 1 : 0);
                }
            }
        }
        HashMap<String, Boolean> map2 = this.confirmConfig;
        if (map2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map2.size());
        for (Map.Entry<String, Boolean> entry2 : map2.entrySet()) {
            dest.writeString(entry2.getKey());
            Boolean value2 = entry2.getValue();
            if (value2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(value2.booleanValue() ? 1 : 0);
            }
        }
    }

    public /* synthetic */ TradingNoticeEntity(HashMap map, HashMap map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : map, (i11 & 2) != 0 ? null : map2);
    }
}
