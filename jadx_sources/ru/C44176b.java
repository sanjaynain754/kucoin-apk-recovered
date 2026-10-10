package ru;

import android.app.Activity;
import com.blankj.utilcode.util.C5264d;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ru.b */
/* JADX INFO: compiled from: GooglePlayReview.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/play/review/GooglePlayReview;", "", "<init>", "()V", "launchReview", "", "context", "Landroid/app/Activity;", "LGooglePlay_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44176b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44176b f97516a = new C44176b();

    /* JADX INFO: renamed from: c */
    public static final void m97394c(ReviewManager reviewManager, Activity activity, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m97395b(@NotNull final Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C5264d.m6169o("com.android.vending")) {
            final ReviewManager reviewManagerCreate = ReviewManagerFactory.create(context);
            reviewManagerCreate.requestReviewFlow().addOnCompleteListener(new OnCompleteListener() { // from class: ru.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C44176b.m97394c(reviewManagerCreate, context, task);
                }
            });
        }
    }
}
