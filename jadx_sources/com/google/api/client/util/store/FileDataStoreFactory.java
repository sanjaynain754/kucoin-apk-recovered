package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Maps;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
public class FileDataStoreFactory extends AbstractDataStoreFactory {
    private static final boolean IS_WINDOWS = StandardSystemProperty.OS_NAME.value().toLowerCase(Locale.ENGLISH).startsWith("windows");
    private final File dataDirectory;

    public static class FileDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {
        private final File dataFile;

        @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
        public FileDataStoreFactory getDataStoreFactory() {
            return (FileDataStoreFactory) super.getDataStoreFactory();
        }

        @Override // com.google.api.client.util.store.AbstractMemoryDataStore
        public void save() throws IOException {
            IOUtils.serialize(this.keyValueMap, new FileOutputStream(this.dataFile));
        }

        public FileDataStore(FileDataStoreFactory fileDataStoreFactory, File file, String str) throws IOException {
            super(fileDataStoreFactory, str);
            File file2 = new File(file, str);
            this.dataFile = file2;
            if (!IOUtils.isSymbolicLink(file2)) {
                if (file2.createNewFile()) {
                    this.keyValueMap = Maps.newHashMap();
                    save();
                    return;
                } else {
                    this.keyValueMap = (HashMap) IOUtils.deserialize(new FileInputStream(file2));
                    return;
                }
            }
            throw new IOException("unable to use a symbolic link: " + file2);
        }
    }

    private static void setPermissionsToOwnerOnly(File file) throws IOException {
        HashSet hashSet = new HashSet();
        hashSet.add(PosixFilePermission.OWNER_READ);
        hashSet.add(PosixFilePermission.OWNER_WRITE);
        hashSet.add(PosixFilePermission.OWNER_EXECUTE);
        try {
            Files.setPosixFilePermissions(Paths.get(file.getAbsolutePath(), new String[0]), hashSet);
        } catch (RuntimeException e11) {
            throw new IOException("Unable to set permissions for " + file, e11);
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStoreFactory
    public <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException {
        return new FileDataStore(this, this.dataDirectory, str);
    }

    public final File getDataDirectory() {
        return this.dataDirectory;
    }

    public FileDataStoreFactory(File file) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        if (!IOUtils.isSymbolicLink(canonicalFile)) {
            if (!canonicalFile.exists() && !canonicalFile.mkdirs()) {
                throw new IOException("unable to create directory: " + canonicalFile);
            }
            this.dataDirectory = canonicalFile;
            if (IS_WINDOWS) {
                setPermissionsToOwnerOnlyWindows(canonicalFile);
                return;
            } else {
                setPermissionsToOwnerOnly(canonicalFile);
                return;
            }
        }
        throw new IOException("unable to use a symbolic link: " + canonicalFile);
    }

    private static void setPermissionsToOwnerOnlyWindows(File file) throws IOException {
        Path path = Paths.get(file.getAbsolutePath(), new String[0]);
        try {
            C7955t.m13359a(Files.getFileAttributeView(path, C7954s.m13358a(), new LinkOption[0])).setAcl(ImmutableList.m13440of(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(C7952q.m13356a(Files.getFileAttributeView(path, C7941f.m13345a(), new LinkOption[0])).getOwner()).setPermissions((Set<AclEntryPermission>) ImmutableSet.m13493of(AclEntryPermission.APPEND_DATA, AclEntryPermission.DELETE, AclEntryPermission.DELETE_CHILD, AclEntryPermission.READ_ACL, AclEntryPermission.READ_ATTRIBUTES, AclEntryPermission.READ_DATA, AclEntryPermission.READ_NAMED_ATTRS, AclEntryPermission.SYNCHRONIZE, AclEntryPermission.WRITE_ACL, AclEntryPermission.WRITE_ATTRIBUTES, AclEntryPermission.WRITE_DATA, AclEntryPermission.WRITE_NAMED_ATTRS, AclEntryPermission.WRITE_OWNER)).build()));
        } catch (SecurityException e11) {
            throw new IOException("Unable to set permissions for " + file, e11);
        }
    }
}
