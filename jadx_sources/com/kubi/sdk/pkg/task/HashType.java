package com.kubi.sdk.pkg.task;

import com.kubi.sdk.pkg.util.C23986c;
import com.kubi.sdk.pkg.util.Sha1Util;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HashType.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/HashType;", "", "", "<init>", "(Ljava/lang/String;I)V", "Sha1", "Rsa", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public enum HashType {
    Sha1 { // from class: com.kubi.sdk.pkg.task.HashType.Sha1
        @Override // com.kubi.sdk.pkg.task.HashType
        public boolean compareFile(@NotNull File file, @NotNull String hash) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(hash, "hash");
            return Sha1Util.m57838a(hash, file);
        }
    },
    Rsa { // from class: com.kubi.sdk.pkg.task.HashType.Rsa
        @Override // com.kubi.sdk.pkg.task.HashType
        public boolean compareFile(@NotNull File file, @NotNull String hash) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(hash, "hash");
            return C23986c.m57878a(hash, file);
        }
    };

    /* synthetic */ HashType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract /* synthetic */ boolean compareFile(@NotNull File file, @NotNull String str);
}
