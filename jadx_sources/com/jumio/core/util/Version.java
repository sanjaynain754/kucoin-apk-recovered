package com.jumio.core.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Regex;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/core/util/Version;", "", "version", "", "<init>", "(Ljava/lang/String;)V", "compareTo", "", "other", "equals", "", "", "toString", "component1", "copy", "hashCode", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Version.kt\ncom/jumio/core/util/Version\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,45:1\n1#2:46\n37#3:47\n36#3,3:48\n37#3:51\n36#3,3:52\n*S KotlinDebug\n*F\n+ 1 Version.kt\ncom/jumio/core/util/Version\n*L\n13#1:47\n13#1:48,3\n14#1:51\n14#1:52,3\n*E\n"})
public final /* data */ class Version implements Comparable<Version> {

    /* JADX INFO: renamed from: a */
    public final String f14582a;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && Intrinsics.areEqual(Version.class, other.getClass()) && compareTo((Version) other) == 0;
    }

    public Version(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f14582a = version;
        if (!new Regex("[0-9]+(\\.[0-9]+)*").matches(version)) {
            throw new IllegalArgumentException("Invalid version format");
        }
    }

    public static /* synthetic */ Version copy$default(Version version, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = version.f14582a;
        }
        return version.copy(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(@Nullable Version other) {
        if (other == null) {
            return 1;
        }
        String[] strArr = (String[]) new Regex("\\.").split(this.f14582a, 0).toArray(new String[0]);
        String[] strArr2 = (String[]) new Regex("\\.").split(other.f14582a, 0).toArray(new String[0]);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(strArr.length, strArr2.length);
        int i11 = 0;
        while (i11 < iCoerceAtLeast) {
            int i12 = i11 < strArr.length ? Integer.parseInt(strArr[i11]) : 0;
            int i13 = i11 < strArr2.length ? Integer.parseInt(strArr2[i11]) : 0;
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
            i11++;
        }
        return 0;
    }

    @NotNull
    public final Version copy(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new Version(version);
    }

    public int hashCode() {
        return this.f14582a.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getF14582a() {
        return this.f14582a;
    }
}
