package org.example;

public enum Weapon {
        SWORD(20, 5);

        private int damage;
        private double attackSpeed;
        public int getDamage() {
            return damage;
        }

        public double getAttackSpeed() {
            return attackSpeed;
        }
        Weapon(int damage, double attackSpeed) {
            this.damage = damage;
            this.attackSpeed = attackSpeed;
        }


    }



