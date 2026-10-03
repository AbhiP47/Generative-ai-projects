// swiggy menu data — single source of truth
const IMG_BASE = 'https://cdn.menuimages.com/11/';

const RESTAURANTS = [
  {
    id: 1, name: "Domino's Pizza", cuisine: ['Pizzas', 'Italian', 'Fast Food'],
    rating: 4.3, timeCost: '20-25 MINS', costForTwo: '₹299', promoText: '10% OFF',
    isOpen: true, slogan: 'Baked to bite, hot and fresh',
    dishes: [
      ['Margherita Pizza', 169, 'Classic cheese & garlic base', 'v'],
      ['Pepperoni Feast', 320, 'Double pepperoni + muzzarella', 'n'],
      ['Farmhouse Pizza', 290, 'Onion, capsicum, mushroom', 'v'],
      ['Cheesy Garlic Bread', 99, 'Golden bread, loaded cheese', 'v'],
      ['Chicken Tikkha Pizza', 349, 'Spiced chicken & jalapeño', 'n'],
      ['Honey Chicken Pizza', 310, 'Marinated chicken, honey glaze', 'n'],
      ['Choco Lava Cake', 129, 'Molten chocolate center', 'v'],
      ['Crispy Corn Burger', 79, 'Cheesy corn patty', 'v'],
      ['Vanilla Softice Cone', 59, 'Smooth vanilla scoop', 'v'],
      ['Oreo Thins Pizza', 249, 'Crisp