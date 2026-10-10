package com.jumio.liveness.data;

import java.util.Locale;
import jumio.liveness.EnumC40801r;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/liveness/data/Distance$Companion;", "", "<init>", "()V", "fromStepName", "Lcom/jumio/liveness/data/Distance;", "stepName", "", "jumio-liveness_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Distance$Companion {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        return jumio.liveness.EnumC40801r.f90643c;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC40801r fromStepName(@NotNull String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        String lowerCase = stepName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 101143) {
            if (iHashCode != 3377192) {
            }
        } else if (lowerCase.equals("far")) {
            return EnumC40801r.FAR;
        }
        return EnumC40801r.INITIAL;
    }

    public Distance$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
