#!/bin/bash

# scripts are from mod_utils project on my GitHub.

ID='classicalalchemy'
NAME='ClassicalAlchemy'
TOPDIR=`pwd`
PROJNAME=`basename $TOPDIR`
if [ $PROJNAME != $NAME ]; then
    echo "Running in wrong directory!"
    exit 1
fi

# blockstates
TARGETDIR=${TOPDIR}/src/main/resources/assets/${ID}/blockstates
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# make simple blockstates
gen_blockstate_jsons.py --type=simple cuprum_block 
gen_blockstate_jsons.py --type=simple stannum_block 
gen_blockstate_jsons.py --type=simple pyropus_bronze_block 
gen_blockstate_jsons.py --type=simple pulchrum_bronze_block 
gen_blockstate_jsons.py --type=simple tomb_bronze_block 

# models
TARGETDIR=${TOPDIR}/src/main/resources/assets/${ID}/models
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# block models
gen_model_jsons.py --type=block cuprum_block 
gen_model_jsons.py --type=block stannum_block 
gen_model_jsons.py --type=block pyropus_bronze_block 
gen_model_jsons.py --type=block pulchrum_bronze_block 
gen_model_jsons.py --type=block tomb_bronze_block 

#inventory items
gen_model_jsons.py --type=inventory --item_only stannum_ingot
gen_model_jsons.py --type=inventory --item_only stannum_nugget
gen_model_jsons.py --type=inventory --item_only stannum_dust
gen_model_jsons.py --type=inventory --item_only medium_stannum_chunk
gen_model_jsons.py --type=inventory --item_only large_stannum_chunk
gen_model_jsons.py --type=inventory --item_only cuprum_ingot
gen_model_jsons.py --type=inventory --item_only cuprum_nugget
gen_model_jsons.py --type=inventory --item_only cuprum_dust
gen_model_jsons.py --type=inventory --item_only medium_cuprum_chunk
gen_model_jsons.py --type=inventory --item_only large_cuprum_chunk
gen_model_jsons.py --type=inventory --item_only pulchrum_bronze_ingot
gen_model_jsons.py --type=inventory --item_only pulchrum_bronze_nugget
gen_model_jsons.py --type=inventory --item_only pulchrum_bronze_dust
gen_model_jsons.py --type=inventory --item_only large_pulchrum_bronze_chunk
gen_model_jsons.py --type=inventory --item_only pyropus_bronze_ingot
gen_model_jsons.py --type=inventory --item_only pyropus_bronze_nugget
gen_model_jsons.py --type=inventory --item_only pyropus_bronze_dust
gen_model_jsons.py --type=inventory --item_only medium_pyropus_bronze_chunk
gen_model_jsons.py --type=inventory --item_only large_pyropus_bronze_chunk
gen_model_jsons.py --type=inventory --item_only tomb_bronze_ingot
gen_model_jsons.py --type=inventory --item_only tomb_bronze_nugget
gen_model_jsons.py --type=inventory --item_only tomb_bronze_dust
gen_model_jsons.py --type=inventory --item_only medium_tomb_bronze_chunk
gen_model_jsons.py --type=inventory --item_only large_tomb_bronze_chunk

# tools
gen_model_jsons.py --type=tool --item_only stannum_sword
gen_model_jsons.py --type=tool --item_only stannum_shovel
gen_model_jsons.py --type=tool --item_only stannum_axe
gen_model_jsons.py --type=tool --item_only stannum_pickaxe
gen_model_jsons.py --type=tool --item_only stannum_hoe

gen_model_jsons.py --type=tool --item_only cuprum_sword
gen_model_jsons.py --type=tool --item_only cuprum_shovel
gen_model_jsons.py --type=tool --item_only cuprum_axe
gen_model_jsons.py --type=tool --item_only cuprum_pickaxe
gen_model_jsons.py --type=tool --item_only cuprum_hoe

gen_model_jsons.py --type=tool --item_only pyropus_bronze_sword
gen_model_jsons.py --type=tool --item_only pyropus_bronze_shovel
gen_model_jsons.py --type=tool --item_only pyropus_bronze_axe
gen_model_jsons.py --type=tool --item_only pyropus_bronze_pickaxe
gen_model_jsons.py --type=tool --item_only pyropus_bronze_hoe

gen_model_jsons.py --type=tool --item_only pulchrum_bronze_sword
gen_model_jsons.py --type=tool --item_only pulchrum_bronze_shovel
gen_model_jsons.py --type=tool --item_only pulchrum_bronze_axe
gen_model_jsons.py --type=tool --item_only pulchrum_bronze_pickaxe
#gen_model_jsons.py --type=tool --item_only pulchrum_bronze_hoe

gen_model_jsons.py --type=tool --item_only tomb_bronze_sword
gen_model_jsons.py --type=tool --item_only tomb_bronze_shovel
gen_model_jsons.py --type=tool --item_only tomb_bronze_axe
gen_model_jsons.py --type=tool --item_only tomb_bronze_pickaxe
#gen_model_jsons.py --type=tool --item_only tomb_bronze_hoe

# armor sets
gen_model_jsons.py --type=armor --item_only cuprum_helmet
gen_model_jsons.py --type=armor --item_only cuprum_chestplate
gen_model_jsons.py --type=armor --item_only cuprum_leggings
gen_model_jsons.py --type=armor --item_only cuprum_boots

gen_model_jsons.py --type=armor --item_only stannum_helmet
gen_model_jsons.py --type=armor --item_only stannum_chestplate
gen_model_jsons.py --type=armor --item_only stannum_leggings
gen_model_jsons.py --type=armor --item_only stannum_boots

gen_model_jsons.py --type=armor --item_only pyropus_bronze_helmet
gen_model_jsons.py --type=armor --item_only pyropus_bronze_chestplate
gen_model_jsons.py --type=armor --item_only pyropus_bronze_leggings
gen_model_jsons.py --type=armor --item_only pyropus_bronze_boots

gen_model_jsons.py --type=armor --item_only tomb_bronze_helmet
gen_model_jsons.py --type=armor --item_only tomb_bronze_chestplate
gen_model_jsons.py --type=armor --item_only tomb_bronze_leggings
gen_model_jsons.py --type=armor --item_only tomb_bronze_boots
