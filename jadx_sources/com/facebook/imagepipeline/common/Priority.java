package com.facebook.imagepipeline.common;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Priority.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m90084d2 = {"Lcom/facebook/imagepipeline/common/Priority;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "Companion", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public enum Priority {
    LOW,
    MEDIUM,
    HIGH;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f8892c = EnumEntriesKt.enumEntries(m9186a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: Priority.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/imagepipeline/common/Priority$Companion;", "", "<init>", "()V", "getHigherPriority", "Lcom/facebook/imagepipeline/common/Priority;", "priority1", "priority2", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final Priority getHigherPriority(@NotNull Priority priority1, @NotNull Priority priority2) {
            Intrinsics.checkNotNullParameter(priority1, "priority1");
            Intrinsics.checkNotNullParameter(priority2, "priority2");
            if (priority1.ordinal() > priority2.ordinal()) {
                return priority1;
            }
            return priority2;
        }
    }

    @NotNull
    public static EnumEntries<Priority> getEntries() {
        return f8892c;
    }

    @JvmStatic
    @NotNull
    public static final Priority getHigherPriority(@NotNull Priority priority, @NotNull Priority priority2) {
        return INSTANCE.getHigherPriority(priority, priority2);
    }
}
