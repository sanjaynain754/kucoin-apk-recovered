package com.kubi.kucoin.startup;

import android.app.Application;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.MimeTypes;
import com.kubi.app.startup.R$font;
import com.kubi.kucoin.startup.exception.StartupMessage;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UISetupStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/UIFontStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "replaceTypefaceField", "value", "", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "ui_font", priority = 200, stepType = StartupStepType.Application, threadType = StartupThreadType.Await)
@SourceDebugExtension({"SMAP\nUISetupStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UISetupStartupTask.kt\ncom/kubi/kucoin/startup/UIFontStartupTask\n+ 2 StartupIssue.kt\ncom/kubi/kucoin/startup/exception/StartupIssueKt\n*L\n1#1,92:1\n48#2,2:93\n48#2,2:95\n*S KotlinDebug\n*F\n+ 1 UISetupStartupTask.kt\ncom/kubi/kucoin/startup/UIFontStartupTask\n*L\n73#1:93,2\n88#1:95,2\n*E\n"})
public final class UIFontStartupTask implements IStartupTask {
    private final void replaceTypefaceField(Object value) {
        try {
            Field declaredField = Typeface.class.getDeclaredField("MONOSPACE");
            declaredField.setAccessible(true);
            declaredField.set(null, value);
        } catch (Throwable th2) {
            C43846g.m96568c(new StartupMessage("replaceTypefaceField error: " + th2.getMessage(), "UIFontStartupTask", false, 4, null), null, 2, null);
            C44128b.m97264h(th2);
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        try {
            Typeface font = ResourcesCompat.getFont(application, R$font.medium);
            if (font != null) {
                replaceTypefaceField(font);
            } else {
                font = null;
            }
            Typeface font2 = ResourcesCompat.getFont(application, R$font.regular);
            if (font == null || font2 == null) {
                return;
            }
            SlidingTabLayout.m55252A(font2, font);
            com.kubi.resources.widget.viewpager2.SlidingTabLayout.m55579x(font2, font);
        } catch (Throwable th2) {
            C43846g.m96568c(new StartupMessage("getFont error: " + th2.getMessage(), "UIFontStartupTask", false, 4, null), null, 2, null);
            C44128b.m97264h(th2);
        }
    }
}
