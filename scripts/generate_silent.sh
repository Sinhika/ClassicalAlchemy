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

# recipes
TARGETDIR=${TOPDIR}/src/main/resources/data/${ID}/recipes
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# crusher recipes
make_silents_recipes.py --type=crusher --ingredient="${ID}:cuprum_ingot" \
    --result="${ID}:cuprum_dust" cuprum_dust_from_ingot
make_silents_recipes.py --type=crusher --ingredient="${ID}:stannum_ingot" \
    --result="${ID}:stannum_dust" stannum_dust_from_ingot
make_silents_recipes.py --type=crusher --ingredient="${ID}:pyropus_bronze_ingot" \
    --result="${ID}:pyropus_bronze_dust" pyropus_bronze_dust_from_ingot
make_silents_recipes.py --type=crusher --ingredient="${ID}:pulchrum_bronze_ingot" \
    --result="${ID}:pulchrum_bronze_dust" pulchrum_bronze_dust_from_ingot
make_silents_recipes.py --type=crusher --ingredient="${ID}:tomb_bronze_ingot" \
    --result="${ID}:tomb_bronze_dust" tomb_bronze_dust_from_ingot

# alloy smelter
# cuprum
make_silents_recipes.py --type=alloy_smelter --ingredient "#forge:dusts/copper" \
    "#forge:dusts/copper" "#minecraft:coals" \
    --result "${ID}:cuprum_nugget" -- cuprum_nugget
make_silents_recipes.py --type=alloy_smelter --ingredient "#forge:dusts/copper" \
    "#forge:dusts/copper" "minecraft:bone_meal" \
    --result "${ID}:medium_cuprum_chunk" -- medium_cuprum_chunk
make_silents_recipes.py --type=alloy_smelter --ingredient "#forge:dusts/copper" \
    "#forge:dusts/copper" "minecraft:gunpowder" \
    --result "${ID}:large_cuprum_chunk" -- large_cuprum_chunk

# stannum
make_silents_recipes.py --type=alloy_smelter --ingredient "#forge:dusts/tin" \
    "#forge:dusts/tin" "#minecraft:coals" \
    --result "${ID}:stannum_nugget" -- stannum_nugget
make_silents_recipes.py --type=alloy_smelter --ingredient "#forge:dusts/tin" \
    "#forge:dusts/tin" "minecraft:bone_meal" \
    --result "${ID}:medium_stannum_chunk" -- medium_stannum_chunk
make_silents_recipes.py --type=alloy_smelter --ingredient "#forge:dusts/tin" \
    "#forge:dusts/tin" "minecraft:gunpowder" \
    --result "${ID}:large_stannum_chunk" -- large_stannum_chunk

# pyropus_bronze
make_silents_recipes.py --type=alloy_smelter --ingredient "${ID}:stannum_dust" \
    "${ID}:cuprum_dust" "minecraft:bone_meal" \
    --result "${ID}:pyropus_bronze_nugget" -- pyropus_bronze_nugget
make_silents_recipes.py --type=alloy_smelter --ingredient "${ID}:stannum_dust" \
    "${ID}:cuprum_dust"  "minecraft:gunpowder" \
    --result "${ID}:medium_pyropus_bronze_chunk" -- medium_pyropus_bronze_chunk
make_silents_recipes.py --type=alloy_smelter --ingredient "${ID}:stannum_dust" \
    "${ID}:cuprum_dust"  "minecraft:redstone" \
    --result "${ID}:large_pyropus_bronze_chunk" -- large_pyropus_bronze_chunk

# pulchrum_bronze
make_silents_recipes.py --type=alloy_smelter --ingredient "${ID}:pyropus_bronze_dust" \
    "minecraft:gold_ingot"  "minecraft:redstone" \
    --result "${ID}:large_pulchrum_bronze_chunk" -- large_pulchrum_bronze_chunk

# tomb_bronze
make_silents_recipes.py --type=alloy_smelter --ingredient "${ID}:pyropus_bronze_dust" \
    "arsenic:arsenide_bronze_dust" "minecraft:rotten_flesh" \
    --result "${ID}:tomb_bronze_nugget" -- tomb_bronze_nugget
make_silents_recipes.py --type=alloy_smelter --ingredient "${ID}:pyropus_bronze_dust" \
    "arsenic:arsenide_bronze_dust"  "minecraft:redstone" \
    --result "${ID}:medium_tomb_bronze_chunk" -- medium_tomb_bronze_chunk
make_silents_recipes.py --type=alloy_smelter --ingredient "${ID}:pyropus_bronze_dust" \
    "arsenic:arsenide_bronze_dust"  "minecraft:glowstone_dust" \
    --result "${ID}:large_tomb_bronze_chunk" -- large_tomb_bronze_chunk

