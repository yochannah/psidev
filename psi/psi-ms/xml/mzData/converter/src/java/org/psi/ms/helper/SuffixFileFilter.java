/**
 * $Id: SuffixFileFilter.java,v 1.1 2003/08/11 17:22:16 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 5:40:56 PM
 */
package org.psi.ms.helper;

import java.io.FilenameFilter;
import java.io.File;

/**
 * A FilenameFilter for filtering according to the suffix of the filename.
 */
public class SuffixFileFilter implements FilenameFilter {

    /**
     * The expected suffix of the log file.
     */
    private String suffix;

    public SuffixFileFilter(String suffix) {
        this.suffix = suffix;
    }

    /**
     *
     * @param dir the directory in which the file was found.
     * @param name the name of the file.
     * @return if and only if the name should be included in the file list; false otherwise.
     * @see java.io.FilenameFilter#accept
     */
    public boolean accept(File dir, String name) {
        return name.endsWith(suffix);
    }
}
