package com.kubi.user.site.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.user.exception.UserCenterMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UserCenterSiteConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/user/site/config/TermConfig;", "Landroid/os/Parcelable;", "userTermConfig", "", "Lcom/kubi/user/site/config/Term;", "<init>", "(Ljava/util/List;)V", "getUserTermConfig", "()Ljava/util/List;", "isTermConfigAvailable", "", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserCenterSiteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenterSiteConfig.kt\ncom/kubi/user/site/config/TermConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,344:1\n1869#2:345\n1870#2:348\n67#3,2:346\n*S KotlinDebug\n*F\n+ 1 UserCenterSiteConfig.kt\ncom/kubi/user/site/config/TermConfig\n*L\n219#1:345\n219#1:348\n221#1:346,2\n*E\n"})
public final /* data */ class TermConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TermConfig> CREATOR = new C26803a();

    @Nullable
    private final List<Term> userTermConfig;

    /* JADX INFO: renamed from: com.kubi.user.site.config.TermConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26803a implements Parcelable.Creator<TermConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TermConfig[] newArray(int i11) {
            return new TermConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TermConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(Term.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TermConfig(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TermConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TermConfig) && Intrinsics.areEqual(this.userTermConfig, ((TermConfig) other).userTermConfig);
    }

    public TermConfig(@Nullable List<Term> list) {
        this.userTermConfig = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TermConfig copy$default(TermConfig termConfig, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = termConfig.userTermConfig;
        }
        return termConfig.copy(list);
    }

    @Nullable
    public final List<Term> component1() {
        return this.userTermConfig;
    }

    @NotNull
    public final TermConfig copy(@Nullable List<Term> userTermConfig) {
        return new TermConfig(userTermConfig);
    }

    @Nullable
    public final List<Term> getUserTermConfig() {
        return this.userTermConfig;
    }

    public int hashCode() {
        List<Term> list = this.userTermConfig;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean isTermConfigAvailable() {
        List<Term> list = this.userTermConfig;
        if (list != null) {
            for (Term term : list) {
                String termId = term.getTermId();
                if (termId == null || termId.length() == 0) {
                    C43846g.m96568c(new UserCenterMessage("isTermConfigAvailable termCode is " + term.getTermCode() + ", termId is " + term.getTermId() + ", siteType is " + SiteInfoManager.f47913a.m58109c(), "TermConfig", false, 4, null), null, 2, null);
                }
            }
        }
        return this.userTermConfig != null;
    }

    @NotNull
    public String toString() {
        return "TermConfig(userTermConfig=" + this.userTermConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<Term> list = this.userTermConfig;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Term> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ TermConfig(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
