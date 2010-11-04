#ifndef __EXTRACT_FILEWALK_HPP__
#define __EXTRACT_FILEWALK_HPP__

#include "utils.hpp"

#define EXTRACT_CONFIG_DEFAULT_OUTPUT_FILE "memcached_dump_file.out"


struct extract_config_t {
    // Values that override those read from the db file.
    struct override_t {
        // Zero if the block size is not forced.
        int block_size;
        // Zero if the extent size is not forced.
        int extent_size;
        // Zero if the mod count is not forced.
        int mod_count;  // TODO parse command line

        bool any() { return block_size || extent_size || mod_count; }
    } overrides;

    // The path to the file we're going to recover from.
    std::vector<std_string_t, gnew_alloc<std_string_t> > input_files;

    // TODO: use this
    std_string_t log_file_name;

    // The path to a file that does not exist at the beginning of the
    // program's run, to which we write output files.
    std_string_t output_file;

    static const int NO_FORCED_BLOCK_SIZE = 0;
    static const int NO_FORCED_EXTENT_SIZE = 0;
    static const int NO_FORCED_MOD_COUNT = 0;
    extract_config_t() { init(); }

    void init() { 
        overrides.block_size = NO_FORCED_BLOCK_SIZE;
        overrides.extent_size = NO_FORCED_EXTENT_SIZE;
        overrides.mod_count = NO_FORCED_MOD_COUNT;
        input_files.clear();
        log_file_name = "";
        output_file = EXTRACT_CONFIG_DEFAULT_OUTPUT_FILE;
    }

private:
    DISABLE_COPYING(extract_config_t);
};

void dumpfile(const extract_config_t&);



#endif  // __EXTRACT_FILEWALK_HPP__
