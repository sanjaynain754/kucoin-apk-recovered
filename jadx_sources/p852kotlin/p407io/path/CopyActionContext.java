package p852kotlin.p407io.path;

import java.nio.file.Path;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;

/* JADX INFO: compiled from: CopyActionContext.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.8")
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m90084d2 = {"Lkotlin/io/path/CopyActionContext;", "", "copyToIgnoringExistingDirectory", "Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/Path;", "target", "followLinks", "", "kotlin-stdlib-jdk7"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@ExperimentalPathApi
public interface CopyActionContext {
    @NotNull
    CopyActionResult copyToIgnoringExistingDirectory(@NotNull Path path, @NotNull Path path2, boolean z11);
}
