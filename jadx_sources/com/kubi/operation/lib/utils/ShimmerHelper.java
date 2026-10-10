package com.kubi.operation.lib.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.resources.shimmer.C22911a;
import org.jetbrains.annotations.NotNull;
import p213dw.InterfaceC36986b;
import p701vs.C45634k;
import p701vs.C45635l;
import p701vs.C45638o;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.operation.lib.utils.x, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ShimmerHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/operation/lib/utils/ShimmerHelper;", "", "<init>", "()V", "provideHomeCardShimmer", "", "type", "", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ShimmerHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ShimmerHelper f36897a = new ShimmerHelper();

    /* JADX INFO: renamed from: a */
    public final void m43687a(@NotNull String type, @NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        int iHashCode = type.hashCode();
        if (iHashCode == -820584873) {
            if (type.equals("NO_LOGINED_WELFARE")) {
                C45634k c45634kM100757c = C45634k.m100757c(inflater, parent, true);
                View v11 = c45634kM100757c.f102861b;
                Intrinsics.checkNotNullExpressionValue(v11, "v1");
                InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(v11, Float.valueOf(67.0f));
                if (interfaceC36986bM54400e != null) {
                    interfaceC36986bM54400e.mo54393a();
                }
                C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c45634kM100757c.f102862c, c45634kM100757c.f102863d, c45634kM100757c.f102864e, c45634kM100757c.f102865f, c45634kM100757c.f102866g, c45634kM100757c.f102867h, c45634kM100757c.f102868i, c45634kM100757c.f102869j, c45634kM100757c.f102870k, c45634kM100757c.f102871l, c45634kM100757c.f102872m, c45634kM100757c.f102873n}), false, 1, null);
                View v12 = c45634kM100757c.f102874o;
                Intrinsics.checkNotNullExpressionValue(v12, "v9");
                InterfaceC36986b interfaceC36986bM54400e2 = C22911a.m54400e(v12, Float.valueOf(24.0f));
                if (interfaceC36986bM54400e2 != null) {
                    interfaceC36986bM54400e2.mo54393a();
                    return;
                }
                return;
            }
            return;
        }
        if (iHashCode != 1333333894) {
            if (iHashCode == 1951158380 && type.equals("WELFARE")) {
                C45638o c45638oM100767c = C45638o.m100767c(inflater, parent, true);
                LinearLayoutCompat viewLine = c45638oM100767c.f102891c;
                Intrinsics.checkNotNullExpressionValue(viewLine, "viewLine");
                InterfaceC36986b interfaceC36986bM54399d = C22911a.m54399d(viewLine, null, 1, null);
                if (interfaceC36986bM54399d != null) {
                    interfaceC36986bM54399d.mo54393a();
                }
                View icon = c45638oM100767c.f102890b;
                Intrinsics.checkNotNullExpressionValue(icon, "icon");
                InterfaceC36986b interfaceC36986bM54400e3 = C22911a.m54400e(icon, Float.valueOf(40.0f));
                if (interfaceC36986bM54400e3 != null) {
                    interfaceC36986bM54400e3.mo54393a();
                    return;
                }
                return;
            }
            return;
        }
        if (type.equals("NO_LOGINED_CURRENCY")) {
            C45635l c45635lM100760c = C45635l.m100760c(inflater, parent, true);
            View v13 = c45635lM100760c.f102876b;
            Intrinsics.checkNotNullExpressionValue(v13, "v1");
            InterfaceC36986b interfaceC36986bM54399d2 = C22911a.m54399d(v13, null, 1, null);
            if (interfaceC36986bM54399d2 != null) {
                interfaceC36986bM54399d2.mo54393a();
            }
            View v14 = c45635lM100760c.f102877c;
            Intrinsics.checkNotNullExpressionValue(v14, "v2");
            InterfaceC36986b interfaceC36986bM54399d3 = C22911a.m54399d(v14, null, 1, null);
            if (interfaceC36986bM54399d3 != null) {
                interfaceC36986bM54399d3.mo54393a();
            }
            View v15 = c45635lM100760c.f102878d;
            Intrinsics.checkNotNullExpressionValue(v15, "v3");
            InterfaceC36986b interfaceC36986bM54399d4 = C22911a.m54399d(v15, null, 1, null);
            if (interfaceC36986bM54399d4 != null) {
                interfaceC36986bM54399d4.mo54393a();
            }
        }
    }
}
