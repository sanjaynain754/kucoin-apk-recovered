package com.kubi.assets.holdearn;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.holdearn.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HoldEarnViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnEffect;", "", "<init>", "()V", "openSuccess", "openFailed", "Lcom/kubi/assets/holdearn/HoldEarnEffect$openFailed;", "Lcom/kubi/assets/holdearn/HoldEarnEffect$openSuccess;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class HoldEarnEffect {

    /* JADX INFO: renamed from: com.kubi.assets.holdearn.a$a */
    /* JADX INFO: compiled from: HoldEarnViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnEffect$openFailed;", "Lcom/kubi/assets/holdearn/HoldEarnEffect;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends HoldEarnEffect {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f17749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f17749a = message;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF17749a() {
            return this.f17749a;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.holdearn.a$b */
    /* JADX INFO: compiled from: HoldEarnViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnEffect$openSuccess;", "Lcom/kubi/assets/holdearn/HoldEarnEffect;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends HoldEarnEffect {
        public b() {
            super(null);
        }
    }

    public /* synthetic */ HoldEarnEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public HoldEarnEffect() {
    }
}
