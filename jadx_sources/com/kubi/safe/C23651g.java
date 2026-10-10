package com.kubi.safe;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.safe.g */
/* JADX INFO: compiled from: KeyChain.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/safe/g;", "Lcom/kubi/safe/f;", "", "title", "negative", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "keychain_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23651g extends AbstractC23650f<String> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String negative;

    @Override // com.kubi.safe.AbstractC23650f
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter and merged with bridge method [inline-methods] */
    public String mo56362a() {
        return this.negative;
    }

    @Override // com.kubi.safe.AbstractC23650f
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
    public String mo56363b() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23651g(@NotNull String title, @NotNull String negative) {
        super(title, negative, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(negative, "negative");
        this.title = title;
        this.negative = negative;
    }
}
