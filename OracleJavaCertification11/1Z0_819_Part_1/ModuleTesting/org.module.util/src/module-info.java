module org.module.util {
    // transitive - ensures that anything that requires org.module.util, will be able
    // to get access to org.module.global
    requires transitive org.module.global;

//    exports org.pkg.util;
    exports org.pkg.util to org.module.base, org.module.concrete; // org.pkg.util will only be read
    // by the friends that we specify after the to-keyword.
    // org.module.base is a friend to org.pkg.util
}