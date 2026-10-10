package androidx.camera.core.imagecapture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes23.dex */
public final class FileUtil {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final String TEMP_FILE_PREFIX = "CameraX";
    private static final String TEMP_FILE_SUFFIX = ".tmp";

    public static Uri moveFileToTarget(File file, ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        Uri uriCopyFileToFile = null;
        try {
            try {
                if (isSaveToMediaStore(outputFileOptions)) {
                    uriCopyFileToFile = copyFileToMediaStore(file, outputFileOptions);
                } else if (isSaveToOutputStream(outputFileOptions)) {
                    OutputStream outputStream = outputFileOptions.getOutputStream();
                    Objects.requireNonNull(outputStream);
                    copyFileToOutputStream(file, outputStream);
                } else if (isSaveToFile(outputFileOptions)) {
                    File file2 = outputFileOptions.getFile();
                    Objects.requireNonNull(file2);
                    uriCopyFileToFile = copyFileToFile(file, file2);
                }
                file.delete();
                return uriCopyFileToFile;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th2) {
            file.delete();
            throw th2;
        }
    }

    private static void copyFileToOutputStream(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i11 = fileInputStream.read(bArr);
                if (i11 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i11);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void setContentValuePendingFlag(ContentValues contentValues, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i11));
        }
    }

    private static void updateUriPendingStatus(Uri uri, ContentResolver contentResolver, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            setContentValuePendingFlag(contentValues, i11);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    private FileUtil() {
    }

    private static Uri copyFileToFile(File file, File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri copyFileToMediaStore(File file, ImageCapture.OutputFileOptions outputFileOptions) throws Throwable {
        ContentValues contentValues;
        ContentResolver contentResolver = outputFileOptions.getContentResolver();
        Objects.requireNonNull(contentResolver);
        if (outputFileOptions.getContentValues() != null) {
            contentValues = new ContentValues(outputFileOptions.getContentValues());
        } else {
            contentValues = new ContentValues();
        }
        setContentValuePendingFlag(contentValues, 1);
        Uri uri = null;
        try {
            try {
                Uri uriInsert = contentResolver.insert(outputFileOptions.getSaveCollection(), contentValues);
                try {
                    if (uriInsert != null) {
                        copyTempFileToUri(file, uriInsert, contentResolver);
                        updateUriPendingStatus(uriInsert, contentResolver, 0);
                        return uriInsert;
                    }
                    throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
                } catch (IOException e11) {
                    e = e11;
                    uri = uriInsert;
                    throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (SecurityException e12) {
                    e = e12;
                    uri = uriInsert;
                    throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (Throwable th2) {
                    th = th2;
                    uri = uriInsert;
                    if (uri != null) {
                        updateUriPendingStatus(uri, contentResolver, 0);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (SecurityException e14) {
            e = e14;
        }
    }

    private static void copyTempFileToUri(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                copyFileToOutputStream(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th2) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static File createTempFile(ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        try {
            File file = outputFileOptions.getFile();
            if (file != null) {
                return new File(file.getParent(), TEMP_FILE_PREFIX + UUID.randomUUID().toString() + getFileExtensionWithDot(file));
            }
            return File.createTempFile(TEMP_FILE_PREFIX, TEMP_FILE_SUFFIX);
        } catch (IOException e11) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e11);
        }
    }

    private static String getFileExtensionWithDot(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            return name.substring(iLastIndexOf);
        }
        return "";
    }

    private static boolean isSaveToFile(ImageCapture.OutputFileOptions outputFileOptions) {
        if (outputFileOptions.getFile() != null) {
            return true;
        }
        return false;
    }

    private static boolean isSaveToMediaStore(ImageCapture.OutputFileOptions outputFileOptions) {
        if (outputFileOptions.getSaveCollection() != null && outputFileOptions.getContentResolver() != null && outputFileOptions.getContentValues() != null) {
            return true;
        }
        return false;
    }

    private static boolean isSaveToOutputStream(ImageCapture.OutputFileOptions outputFileOptions) {
        if (outputFileOptions.getOutputStream() != null) {
            return true;
        }
        return false;
    }

    public static void updateFileExif(File file, Exif exif, ImageCapture.OutputFileOptions outputFileOptions, int i11) throws ImageCaptureException {
        try {
            Exif exifCreateFromFile = Exif.createFromFile(file);
            exif.copyToCroppedImage(exifCreateFromFile);
            if (exifCreateFromFile.getRotation() == 0 && i11 != 0) {
                exifCreateFromFile.rotate(i11);
            }
            ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (metadata.isReversedHorizontal()) {
                exifCreateFromFile.flipHorizontally();
            }
            if (metadata.isReversedVertical()) {
                exifCreateFromFile.flipVertically();
            }
            if (metadata.getLocation() != null) {
                exifCreateFromFile.attachLocation(metadata.getLocation());
            }
            exifCreateFromFile.save();
        } catch (IOException e11) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e11);
        }
    }
}
